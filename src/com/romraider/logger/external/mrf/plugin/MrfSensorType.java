/*
 * RomRaider Open-Source Tuning, Logging and Reflashing
 * Copyright (C) 2006-2010 RomRaider.com
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.romraider.logger.external.mrf.plugin;

public enum MrfSensorType {
    OIL_TEMP(0),
    EGT(1),
    MAP(2),
    OIL_PRESS(3),
    AFR(4);

    private final int index;

    private MrfSensorType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static MrfSensorType valueOf(int index) {
        for (MrfSensorType type : values()) {
            if (type.getIndex() == index) return type;
        }
        return null;
    }
}