package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnv {
    public final String a;
    public final String b;
    public final gnw c;
    public final String d;
    public final Long e;
    public final String f;
    public final Integer g;
    public final boolean h;
    public final Integer i;
    public final boolean j;
    public final int k;
    private final boolean l;

    public gnv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        gnw gnwVar;
        String str2;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnv) {
            gnv gnvVar = (gnv) obj;
            if (this.a.equals(gnvVar.a) && ((str = this.b) != null ? str.equals(gnvVar.b) : gnvVar.b == null)) {
                int i = this.k;
                int i2 = gnvVar.k;
                if (i != 0) {
                    if (i2 == 1 && ((gnwVar = this.c) != null ? gnwVar.equals(gnvVar.c) : gnvVar.c == null) && this.d.equals(gnvVar.d) && this.e.equals(gnvVar.e) && ((str2 = this.f) != null ? str2.equals(gnvVar.f) : gnvVar.f == null) && ((num = this.g) != null ? num.equals(gnvVar.g) : gnvVar.g == null) && this.h == gnvVar.h && this.i.equals(gnvVar.i) && this.l == gnvVar.l && this.j == gnvVar.j) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i;
        int i2;
        int hashCode4 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int O = ((((hashCode4 * (-721379959)) ^ hashCode) * 1000003) ^ a.O(this.k)) * 1000003;
        gnw gnwVar = this.c;
        if (gnwVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = gnwVar.hashCode();
        }
        int hashCode5 = (((((O ^ hashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str2 = this.f;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (hashCode5 ^ hashCode3) * (-721379959);
        Integer num = this.g;
        if (num != null) {
            i3 = num.hashCode();
        }
        int i5 = (i4 ^ i3) * (-721379959);
        int i6 = 1231;
        if (true != this.h) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode6 = (((((((((i5 ^ i) * 1000003) ^ 1237) * 1000003) ^ 1237) * (-721379959)) ^ 1237) * 1000003) ^ this.i.hashCode()) * 1000003;
        if (true != this.l) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i7 = (hashCode6 ^ i2) * 1000003;
        if (true != this.j) {
            i6 = 1237;
        }
        return i7 ^ i6;
    }

    public final String toString() {
        String str;
        if (this.k != 1) {
            str = "null";
        } else {
            str = "PRODUCTION";
        }
        return "GnpConfig{clientId=" + this.a + ", selectionTokens=null, gcmSenderProjectId=" + this.b + ", defaultEnvironment=" + str + ", systemTrayNotificationConfig=" + String.valueOf(this.c) + ", deviceName=" + this.d + ", registrationStalenessTimeMs=" + this.e + ", scheduledTaskService=" + this.f + ", apiKey=null, jobSchedulerAllowedIDsRange=" + this.g + ", firebaseOptions=null, disableEntrypoints=" + this.h + ", useDefaultFirebaseApp=false, useFirebaseReceiver=false, timeToLiveDays=null, enableEndToEndEncryption=false, periodRegistrationIntervalDays=" + this.i + ", enableGrowthKitIfExists=" + this.l + ", enableInAppPushFlow=" + this.j + "}";
    }

    public gnv(String str, String str2, int i, gnw gnwVar, String str3, Long l, String str4, Integer num, boolean z, Integer num2, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.k = 1;
        this.c = gnwVar;
        this.d = str3;
        this.e = l;
        this.f = str4;
        this.g = num;
        this.h = z;
        this.i = num2;
        this.l = z2;
        this.j = z3;
    }
}
