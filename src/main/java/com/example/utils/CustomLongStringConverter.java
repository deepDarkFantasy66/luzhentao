package com.example.utils;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

public class CustomLongStringConverter implements Converter<Long> {

    @Override
    public Class supportJavaTypeKey() {
        return Long.class;
    }

    @Override
    public com.alibaba.excel.enums.CellDataTypeEnum supportExcelTypeKey() {
        return com.alibaba.excel.enums.CellDataTypeEnum.STRING;
    }

    @Override
    public Long convertToJavaData(CellData cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        return Long.parseLong(cellData.getStringValue());
    }



    @Override
    public CellData convertToExcelData(Long value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        return new CellData(value.toString());
    }
}