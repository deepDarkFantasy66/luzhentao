package com.example.learn.demo;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExcelExportDemo {

    public static void exportGdpData() {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("GDP Data");

        // Create the list data
        String[] cities = {"City A", "City B", "City C"};
        double[] gdpValues = {1000, 2000, 3000};

        // Create the list headers
        Row headerRow = sheet.createRow(0);
        Cell headerCell = headerRow.createCell(0);
        headerCell.setCellValue("City");
        headerCell = headerRow.createCell(1);
        headerCell.setCellValue("GDP");

        // Populate the list data
        for (int i = 0; i < cities.length; i++) {
            Row dataRow = sheet.createRow(i + 1);
            Cell dataCell = dataRow.createCell(0);
            dataCell.setCellValue(cities[i]);
            dataCell = dataRow.createCell(1);
            dataCell.setCellValue(gdpValues[i]);
        }

        // Create the bar chart 1
        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
        for (int i = 0; i < cities.length; i++) {
            dataset1.addValue(gdpValues[i], "GDP", cities[i]);
        }
        JFreeChart chart1 = ChartFactory.createBarChart("GDP by City 1", "City", "GDP", dataset1);

// Convert the chart 1 to an image
        ByteArrayOutputStream chartOutputStream1 = new ByteArrayOutputStream();
        try {
            ChartUtilities.writeChartAsPNG(chartOutputStream1, chart1, 800, 400);
        } catch (IOException e) {
            e.printStackTrace();
        }

// Create the image 1 and add it to the Excel file
        int pictureIndex1 = workbook.addPicture(chartOutputStream1.toByteArray(), Workbook.PICTURE_TYPE_PNG);
        CreationHelper helper = workbook.getCreationHelper();
        Drawing<?> drawing = sheet.createDrawingPatriarch();
        ClientAnchor anchor1 = helper.createClientAnchor();
        anchor1.setCol1(3); // Adjust the column index as needed
        anchor1.setRow1(1); // Adjust the row index as needed
        Picture picture1 = drawing.createPicture(anchor1, pictureIndex1);
        picture1.resize(); // Adjust the size of the picture as needed

// Create the bar chart 2
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        for (int i = 0; i < cities.length; i++) {
            dataset2.addValue(gdpValues[i] * 2, "GDP", cities[i]);
        }
        JFreeChart chart2 = ChartFactory.createBarChart("GDP by City 2", "City", "GDP", dataset2);

// Convert the chart 2 to an image
        ByteArrayOutputStream chartOutputStream2 = new ByteArrayOutputStream();
        try {
            ChartUtilities.writeChartAsPNG(chartOutputStream2, chart2, 800, 400);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create the image 2 and add it to the Excel file
        int pictureIndex2 = workbook.addPicture(chartOutputStream2.toByteArray(), Workbook.PICTURE_TYPE_PNG);
        ClientAnchor anchor2 = helper.createClientAnchor();
        anchor2.setCol1(3); // Adjust the column index as needed
        anchor2.setRow1(15); // Adjust the row index as needed
        Picture picture2 = drawing.createPicture(anchor2, pictureIndex2);
        picture2.resize(); // Adjust the size of the picture as needed

// Save the workbook as an Excel file in the D drive
        try (FileOutputStream outputStream = new FileOutputStream("D:/gdp_data.xlsx")) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




            public static void main(String[] args) {
                List<BigDecimalObject> objects = Arrays.asList(
                        new BigDecimalObject(new BigDecimal("1.23"), "kg"),
                        new BigDecimalObject(new BigDecimal("2.34"), "kg"),
                        new BigDecimalObject(new BigDecimal("3.45"), "g"),
                        new BigDecimalObject(new BigDecimal("1.23"), "g"),
                        new BigDecimalObject(new BigDecimal("2.34"), "kg")
                );

                Map<String, BigDecimal> sumByUnit = objects.stream()
                        .collect(Collectors.groupingBy(
                                BigDecimalObject::getUnit,
                                Collectors.reducing(BigDecimal.ZERO, BigDecimalObject::getValue, BigDecimal::add)
                        ));

                System.out.println("Sum by Unit: " + sumByUnit);
            }
        }




    class BigDecimalObject {
        private BigDecimal value;
        private String unit;

        public BigDecimalObject(BigDecimal value, String unit) {
            this.value = value;
            this.unit = unit;
        }

        public BigDecimal getValue() {
            return value;
        }

        public String getUnit() {
            return unit;
        }
    }