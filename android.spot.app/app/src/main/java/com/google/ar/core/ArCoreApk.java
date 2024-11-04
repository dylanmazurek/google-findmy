package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.ar.core.exceptions.FatalException;
import defpackage.a;
import defpackage.jby;
import defpackage.jbz;
import defpackage.jca;
import defpackage.jcb;
import defpackage.jcc;
import defpackage.jcd;
import defpackage.jce;
import defpackage.jci;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ArCoreApk {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class Availability {
        final int nativeCode;
        public static final Availability UNKNOWN_ERROR = new jby();
        public static final Availability UNKNOWN_CHECKING = new jbz();
        public static final Availability UNKNOWN_TIMED_OUT = new jca();
        public static final Availability UNSUPPORTED_DEVICE_NOT_CAPABLE = new jcb();
        public static final Availability SUPPORTED_NOT_INSTALLED = new jcc();
        public static final Availability SUPPORTED_APK_TOO_OLD = new jcd();
        public static final Availability SUPPORTED_INSTALLED = new jce();
        private static final /* synthetic */ Availability[] $VALUES = $values();

        private static /* synthetic */ Availability[] $values() {
            return new Availability[]{UNKNOWN_ERROR, UNKNOWN_CHECKING, UNKNOWN_TIMED_OUT, UNSUPPORTED_DEVICE_NOT_CAPABLE, SUPPORTED_NOT_INSTALLED, SUPPORTED_APK_TOO_OLD, SUPPORTED_INSTALLED};
        }

        static Availability forNumber(int i) {
            for (Availability availability : values()) {
                if (availability.nativeCode == i) {
                    return availability;
                }
            }
            throw new FatalException(a.ae(i, "Unexpected value for native Availability, value="));
        }

        public static Availability valueOf(String str) {
            return (Availability) Enum.valueOf(Availability.class, str);
        }

        public static Availability[] values() {
            return (Availability[]) $VALUES.clone();
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }

        private Availability(String str, int i, int i2) {
            this.nativeCode = i2;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface ICheckAvailabilityCallback {
        void onResult(Availability availability);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum InstallBehavior {
        REQUIRED(0),
        OPTIONAL(1);

        final int nativeCode;

        InstallBehavior(int i) {
            this.nativeCode = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static InstallBehavior forNumber(int i) {
            for (InstallBehavior installBehavior : values()) {
                if (installBehavior.nativeCode == i) {
                    return installBehavior;
                }
            }
            throw new FatalException(a.ae(i, "Unexpected value for native InstallBehavior, value="));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum InstallStatus {
        INSTALLED(0),
        INSTALL_REQUESTED(1);

        final int nativeCode;

        InstallStatus(int i) {
            this.nativeCode = i;
        }

        static InstallStatus forNumber(int i) {
            for (InstallStatus installStatus : values()) {
                if (installStatus.nativeCode == i) {
                    return installStatus;
                }
            }
            throw new FatalException(a.ae(i, "Unexpected value for native InstallStatus, value="));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum UserMessageType {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);

        final int nativeCode;

        UserMessageType(int i) {
            this.nativeCode = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static UserMessageType forNumber(int i) {
            for (UserMessageType userMessageType : values()) {
                if (userMessageType.nativeCode == i) {
                    return userMessageType;
                }
            }
            throw new FatalException(a.ae(i, "Unexpected value for native UserMessageType, value="));
        }
    }

    public static ArCoreApk getInstance() {
        return jci.a;
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public void checkAvailabilityAsync(Context context, Consumer consumer) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z) {
        throw new UnsupportedOperationException("Stub");
    }

    public void checkAvailability(Context context, ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z, InstallBehavior installBehavior, UserMessageType userMessageType) {
        throw new UnsupportedOperationException("Stub");
    }
}
