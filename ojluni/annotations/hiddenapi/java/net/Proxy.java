/*
 * Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.net;

import android.compat.annotation.UnsupportedAppUsage;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class Proxy {

    @UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
    private Proxy() {
        throw new RuntimeException("Stub!");
    }

    public Proxy(java.net.Proxy.Type type, java.net.SocketAddress sa) {
        throw new RuntimeException("Stub!");
    }

    public java.net.Proxy.Type type() {
        throw new RuntimeException("Stub!");
    }

    public java.net.SocketAddress address() {
        throw new RuntimeException("Stub!");
    }

    public java.lang.String toString() {
        throw new RuntimeException("Stub!");
    }

    public final boolean equals(java.lang.Object obj) {
        throw new RuntimeException("Stub!");
    }

    public final int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public static final java.net.Proxy NO_PROXY;

    static {
        NO_PROXY = null;
    }

    private java.net.SocketAddress sa;

    private java.net.Proxy.Type type;

    @SuppressWarnings({"unchecked", "deprecation", "all"})
    public static enum Type {
        DIRECT,
        HTTP,
        SOCKS;

        private Type() {
            throw new RuntimeException("Stub!");
        }
    }
}
