/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.opensprinkler.internal.api.exception;

/**
 * The {@link DataFormatErrorApiException} exception is thrown when result from the OpenSprinkler
 * API is "result" : 18.
 *
 * @author Chris Graham - Initial contribution
 */
public class DataFormatErrorApiException extends Exception {
    /**
     * Serial ID of this error class.
     */
    private static final long serialVersionUID = -6690218834582334405L;

    /**
     * Basic constructor allowing the storing of a single message.
     *
     * @param message Descriptive message about the error.
     */
    public DataFormatErrorApiException(String message) {
        super(message);
    }
}
