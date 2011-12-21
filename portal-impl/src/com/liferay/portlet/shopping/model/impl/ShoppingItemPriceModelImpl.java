/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.shopping.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;
import com.liferay.portlet.shopping.model.ShoppingItemPrice;
import com.liferay.portlet.shopping.model.ShoppingItemPriceModel;

import java.io.Serializable;

import java.sql.Types;

/**
 * The base model implementation for the ShoppingItemPrice service. Represents a row in the &quot;ShoppingItemPrice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.shopping.model.ShoppingItemPriceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ShoppingItemPriceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingItemPriceImpl
 * @see com.liferay.portlet.shopping.model.ShoppingItemPrice
 * @see com.liferay.portlet.shopping.model.ShoppingItemPriceModel
 * @generated
 */
public class ShoppingItemPriceModelImpl extends BaseModelImpl<ShoppingItemPrice>
	implements ShoppingItemPriceModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a shopping item price model instance should use the {@link com.liferay.portlet.shopping.model.ShoppingItemPrice} interface instead.
	 */
	public static final String TABLE_NAME = "ShoppingItemPrice";
	public static final Object[][] TABLE_COLUMNS = {
			{ "itemPriceId", Types.BIGINT },
			{ "itemId", Types.BIGINT },
			{ "minQuantity", Types.INTEGER },
			{ "maxQuantity", Types.INTEGER },
			{ "price", Types.DOUBLE },
			{ "discount", Types.DOUBLE },
			{ "taxable", Types.BOOLEAN },
			{ "shipping", Types.DOUBLE },
			{ "useShippingFormula", Types.BOOLEAN },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table ShoppingItemPrice (itemPriceId LONG not null primary key,itemId LONG,minQuantity INTEGER,maxQuantity INTEGER,price DOUBLE,discount DOUBLE,taxable BOOLEAN,shipping DOUBLE,useShippingFormula BOOLEAN,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table ShoppingItemPrice";
	public static final String ORDER_BY_JPQL = " ORDER BY shoppingItemPrice.itemId ASC, shoppingItemPrice.itemPriceId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ShoppingItemPrice.itemId ASC, ShoppingItemPrice.itemPriceId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.shopping.model.ShoppingItemPrice"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.shopping.model.ShoppingItemPrice"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.com.liferay.portlet.shopping.model.ShoppingItemPrice"),
			true);
	public static long ITEMID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.shopping.model.ShoppingItemPrice"));

	public ShoppingItemPriceModelImpl() {
	}

	public long getPrimaryKey() {
		return _itemPriceId;
	}

	public void setPrimaryKey(long primaryKey) {
		setItemPriceId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_itemPriceId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return ShoppingItemPrice.class;
	}

	public String getModelClassName() {
		return ShoppingItemPrice.class.getName();
	}

	public long getItemPriceId() {
		return _itemPriceId;
	}

	public void setItemPriceId(long itemPriceId) {
		_columnBitmask = -1L;

		_itemPriceId = itemPriceId;
	}

	public long getItemId() {
		return _itemId;
	}

	public void setItemId(long itemId) {
		_columnBitmask = -1L;

		_itemId = itemId;
	}

	public long getOriginalItemId() {
		return _originalItemId;
	}

	public int getMinQuantity() {
		return _minQuantity;
	}

	public void setMinQuantity(int minQuantity) {
		_minQuantity = minQuantity;
	}

	public int getMaxQuantity() {
		return _maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		_maxQuantity = maxQuantity;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public double getDiscount() {
		return _discount;
	}

	public void setDiscount(double discount) {
		_discount = discount;
	}

	public boolean getTaxable() {
		return _taxable;
	}

	public boolean isTaxable() {
		return _taxable;
	}

	public void setTaxable(boolean taxable) {
		_taxable = taxable;
	}

	public double getShipping() {
		return _shipping;
	}

	public void setShipping(double shipping) {
		_shipping = shipping;
	}

	public boolean getUseShippingFormula() {
		return _useShippingFormula;
	}

	public boolean isUseShippingFormula() {
		return _useShippingFormula;
	}

	public void setUseShippingFormula(boolean useShippingFormula) {
		_useShippingFormula = useShippingFormula;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ShoppingItemPrice toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ShoppingItemPrice)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					ShoppingItemPrice.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ShoppingItemPriceImpl shoppingItemPriceImpl = new ShoppingItemPriceImpl();

		shoppingItemPriceImpl.setItemPriceId(getItemPriceId());
		shoppingItemPriceImpl.setItemId(getItemId());
		shoppingItemPriceImpl.setMinQuantity(getMinQuantity());
		shoppingItemPriceImpl.setMaxQuantity(getMaxQuantity());
		shoppingItemPriceImpl.setPrice(getPrice());
		shoppingItemPriceImpl.setDiscount(getDiscount());
		shoppingItemPriceImpl.setTaxable(getTaxable());
		shoppingItemPriceImpl.setShipping(getShipping());
		shoppingItemPriceImpl.setUseShippingFormula(getUseShippingFormula());
		shoppingItemPriceImpl.setStatus(getStatus());

		shoppingItemPriceImpl.resetOriginalValues();

		return shoppingItemPriceImpl;
	}

	public int compareTo(ShoppingItemPrice shoppingItemPrice) {
		int value = 0;

		if (getItemId() < shoppingItemPrice.getItemId()) {
			value = -1;
		}
		else if (getItemId() > shoppingItemPrice.getItemId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (getItemPriceId() < shoppingItemPrice.getItemPriceId()) {
			value = -1;
		}
		else if (getItemPriceId() > shoppingItemPrice.getItemPriceId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		ShoppingItemPrice shoppingItemPrice = null;

		try {
			shoppingItemPrice = (ShoppingItemPrice)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = shoppingItemPrice.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		ShoppingItemPriceModelImpl shoppingItemPriceModelImpl = this;

		shoppingItemPriceModelImpl._originalItemId = shoppingItemPriceModelImpl._itemId;

		shoppingItemPriceModelImpl._setOriginalItemId = false;

		shoppingItemPriceModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ShoppingItemPrice> toCacheModel() {
		ShoppingItemPriceCacheModel shoppingItemPriceCacheModel = new ShoppingItemPriceCacheModel();

		shoppingItemPriceCacheModel.itemPriceId = getItemPriceId();

		shoppingItemPriceCacheModel.itemId = getItemId();

		shoppingItemPriceCacheModel.minQuantity = getMinQuantity();

		shoppingItemPriceCacheModel.maxQuantity = getMaxQuantity();

		shoppingItemPriceCacheModel.price = getPrice();

		shoppingItemPriceCacheModel.discount = getDiscount();

		shoppingItemPriceCacheModel.taxable = getTaxable();

		shoppingItemPriceCacheModel.shipping = getShipping();

		shoppingItemPriceCacheModel.useShippingFormula = getUseShippingFormula();

		shoppingItemPriceCacheModel.status = getStatus();

		return shoppingItemPriceCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{itemPriceId=");
		sb.append(getItemPriceId());
		sb.append(", itemId=");
		sb.append(getItemId());
		sb.append(", minQuantity=");
		sb.append(getMinQuantity());
		sb.append(", maxQuantity=");
		sb.append(getMaxQuantity());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append(", discount=");
		sb.append(getDiscount());
		sb.append(", taxable=");
		sb.append(getTaxable());
		sb.append(", shipping=");
		sb.append(getShipping());
		sb.append(", useShippingFormula=");
		sb.append(getUseShippingFormula());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.shopping.model.ShoppingItemPrice");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemPriceId</column-name><column-value><![CDATA[");
		sb.append(getItemPriceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemId</column-name><column-value><![CDATA[");
		sb.append(getItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>minQuantity</column-name><column-value><![CDATA[");
		sb.append(getMinQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maxQuantity</column-name><column-value><![CDATA[");
		sb.append(getMaxQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>discount</column-name><column-value><![CDATA[");
		sb.append(getDiscount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxable</column-name><column-value><![CDATA[");
		sb.append(getTaxable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipping</column-name><column-value><![CDATA[");
		sb.append(getShipping());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>useShippingFormula</column-name><column-value><![CDATA[");
		sb.append(getUseShippingFormula());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ShoppingItemPrice.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ShoppingItemPrice.class
		};
	private long _itemPriceId;
	private long _itemId;
	private long _originalItemId;
	private boolean _setOriginalItemId;
	private int _minQuantity;
	private int _maxQuantity;
	private double _price;
	private double _discount;
	private boolean _taxable;
	private double _shipping;
	private boolean _useShippingFormula;
	private int _status;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private ShoppingItemPrice _escapedModelProxy;
}