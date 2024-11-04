package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnw {
    public final Integer a;
    public final Integer b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;

    public gnw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnw) {
            gnw gnwVar = (gnw) obj;
            if (this.a.equals(gnwVar.a) && this.b.equals(gnwVar.b) && this.c == gnwVar.c && this.d == gnwVar.d && this.e == gnwVar.e && this.f == gnwVar.f && ((str = this.g) != null ? str.equals(gnwVar.g) : gnwVar.g == null) && ((str2 = this.h) != null ? str2.equals(gnwVar.h) : gnwVar.h == null) && ((str3 = this.i) != null ? str3.equals(gnwVar.i) : gnwVar.i == null) && this.j == gnwVar.j && this.k == gnwVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        int i3;
        int hashCode2;
        int hashCode3 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.g;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = 1231;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i6 = hashCode3 * (-721379959);
        if (true != this.d) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i7 = (i6 ^ i) * (-721379959);
        if (true != this.e) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i8 = (i7 ^ i2) * 1000003;
        if (true != this.f) {
            i5 = 1237;
        }
        int i9 = (((((i8 ^ i3) * (-721379959)) ^ i5) * 1000003) ^ hashCode) * 1000003;
        String str2 = this.h;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        String str3 = this.i;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((((i10 ^ i4) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "SystemTrayNotificationConfig{iconResourceId=" + this.a + ", appNameResourceId=" + this.b + ", colorResourceId=null, soundEnabled=" + this.c + ", ringtone=null, vibrationEnabled=" + this.d + ", lightsEnabled=" + this.e + ", ledColor=null, displayRecipientAccountName=" + this.f + ", notificationClickedActivity=" + this.g + ", notificationRemovedReceiver=" + this.h + ", defaultChannelId=" + this.i + ", defaultGroupThreshold=" + this.j + ", summaryNotificationThreshold=" + this.k + ", shouldFilterOldThreads=false}";
    }

    public gnw(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayActivity";
        this.h = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayBroadcastReceiver";
        this.i = "main";
        this.j = 1;
        this.k = 1;
    }
}
