/*
*  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.security.tools.dependencycheck.scanner.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Reads values from scanner.properties file
 */
public class ScannerProperties {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScannerProperties.class);
    private static String defaultProductFolderPath;
    private static String dependencyCheckReportFile;
    private static String reportsFolderPath;
    private static String dependencyCheckReportsFolder;
    private static String dependencyCheckMavenCommand;
    private static String mavenM2Home;
    private static String notifyFileUploaded;
    private static String notifyFileExtracted;
    private static String notifyProductCloned;
    private static String notifyScanStatus;
    private static String notifyReportReady;
    private static String scanStatusRunning;
    private static String scanStatusCompleted;
    private static String scanStatusFailed;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new BufferedInputStream(ScannerProperties.class.getClassLoader().getResourceAsStream
                    ("/scanner.properties")));
            defaultProductFolderPath = properties.getProperty("scanner.dependency-check.product.folder.path");
            reportsFolderPath = properties.getProperty("scanner.dependency-check.reports.folder.path");
            dependencyCheckReportFile = properties.getProperty("scanner.dependency-check.report.file");
            dependencyCheckReportsFolder = properties.getProperty("scanner.dependency-check.reports.folder");
            dependencyCheckMavenCommand = properties.getProperty("scanner.dependency-check.mvn.command");
            mavenM2Home = properties.getProperty("scanner.dependency-check.mvn.m2-home");
            notifyFileUploaded = properties.getProperty("scanner.dependency-check.notify.file-uploaded");
            notifyFileExtracted = properties.getProperty("scanner.dependency-check.notify.file-extracted");
            notifyProductCloned = properties.getProperty("scanner.dependency-check.notify.product-cloned");
            notifyScanStatus = properties.getProperty("scanner.dependency-check.notify.scan-status");
            notifyReportReady = properties.getProperty("scanner.dependency-check.notify.report-ready");
            scanStatusRunning = properties.getProperty("scanner.dependency-check.scan.status.running");
            scanStatusCompleted = properties.getProperty("scanner.dependency-check.scan.status.completed");
            scanStatusFailed = properties.getProperty("scanner.dependency-check.scan.status.failed");
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.error(e.toString());
        }
    }

    /**
     * Get default folder path to upload or clone product
     *
     * @return Default product path
     */
    public static String getDefaultProductFolderPath() {
        return defaultProductFolderPath;
    }

    /**
     * Get name of the dependency check report (this file is auto generated by the scanner)
     *
     * @return Name of the generated report file
     */
    public static String getDependencyCheckReportFile() {
        return dependencyCheckReportFile;
    }

    /**
     * Get reports folder path
     *
     * @return Reports folder path
     */
    public static String getReportsFolderPath() {
        return reportsFolderPath;
    }

    /**
     * Get folder name of scan reports
     *
     * @return Reports folder name
     */
    public static String getDependencyCheckReportsFolder() {
        return dependencyCheckReportsFolder;
    }

    /**
     * Get Maven command to execute dependency check scan
     *
     * @return Maven command to execute dependency check
     */
    public static String getDependencyCheckMavenCommand() {
        return dependencyCheckMavenCommand;
    }

    /**
     * Get Maven M2_HOME
     *
     * @return Maven M2_HOME
     */
    public static String getMavenM2Home() {
        return mavenM2Home;
    }

    /**
     * Get Path to notify file uploaded to Automation Manager
     *
     * @return Path to notify file uploaded
     */
    public static String getNotifyFileUploaded() {
        return notifyFileUploaded;
    }

    /**
     * Get Path to notify file extracted to Automation Manager
     *
     * @return Path to notify file extracted
     */
    public static String getNotifyFileExtracted() {
        return notifyFileExtracted;
    }

    /**
     * Get Path to notify product cloned to Automation Manager
     *
     * @return Path to notify product cloned
     */
    public static String getNotifyProductCloned() {
        return notifyProductCloned;
    }

    /**
     * Get Path to notify scan status to Automation Manager
     *
     * @return Path to notify scan status
     */
    public static String getNotifyScanStatus() {
        return notifyScanStatus;
    }

    /**
     * Get Path to notify report ready to Automation Manager
     *
     * @return Path to notify report ready
     */
    public static String getNotifyReportReady() {
        return notifyReportReady;
    }

    /**
     * Get scan status as running (scan status is to notify to Automation Manager)
     *
     * @return Running status
     */
    public static String getScanStatusRunning() {
        return scanStatusRunning;
    }

    /**
     * Get scan status as completed (scan status is to notify to Automation Manager)
     *
     * @return Completed status
     */
    public static String getScanStatusCompleted() {
        return scanStatusCompleted;
    }

    /**
     * Get scan status as failed (scan status is to notify to Automation Manager)
     *
     * @return Failed status
     */
    public static String getScanStatusFailed() {
        return scanStatusFailed;
    }
}
