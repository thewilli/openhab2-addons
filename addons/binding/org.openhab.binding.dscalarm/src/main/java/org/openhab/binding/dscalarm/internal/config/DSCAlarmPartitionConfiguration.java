/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.dscalarm.internal.config;

/**
 * Configuration class for the DSC Alarm Partition Thing.
 *
 * @author Russell Stephens - Initial contribution
 */

public class DSCAlarmPartitionConfiguration {

    // Partition Thing constants
    public static final String PARTITION_NUMBER = "partitionNumber";

    /**
     * The Partition Number. Can be in the range of 1-8. This is a required parameter for a partition.
     */
    public Integer partitionNumber;
}
