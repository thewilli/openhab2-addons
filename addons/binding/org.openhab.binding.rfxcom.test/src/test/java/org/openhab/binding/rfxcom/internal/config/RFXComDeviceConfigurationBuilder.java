/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.rfxcom.internal.config;

/**
 * Test helper for RFXCom-binding
 *
 * @author Martin van Wingerden
 */
public class RFXComDeviceConfigurationBuilder {
    private final RFXComDeviceConfiguration config;

    public RFXComDeviceConfigurationBuilder() {
        config = new RFXComDeviceConfiguration();
    }

    public RFXComDeviceConfigurationBuilder withDeviceId(String deviceId) {
        config.deviceId = deviceId;
        return this;
    }

    public RFXComDeviceConfigurationBuilder withSubType(String subType) {
        config.subType = subType;
        return this;
    }

    public RFXComDeviceConfigurationBuilder withPulse(Integer pulse) {
        config.pulse = pulse;
        return this;
    }

    public RFXComDeviceConfiguration build() {
        return config;
    }
}
