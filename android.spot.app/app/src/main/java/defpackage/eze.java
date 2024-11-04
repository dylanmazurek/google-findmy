package defpackage;

import android.content.Context;
import android.location.Geocoder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eze {
    private static final jnk a = jnk.l("com/google/android/apps/adm/util/ReverseGeocoder");
    private static final jjr b = jjr.s("AD", "AT", "AX", "BE", "BG", "BL", "CH", "CP", "CQ", "CY", "CZ", "DE", "DK", "EA", "EE", "ES", "FI", "FR", "GB", "GF", "GG", "GI", "GP", "GR", "HR", "HU", "IC", "IE", "IM", "IS", "IT", "JE", "LI", "LT", "LU", "LV", "MC", "MF", "MT", "MQ", "NC", "NL", "NO", "PF", "PL", "PM", "PT", "RE", "RO", "SE", "SI", "SJ", "SK", "SM", "TF", "VA", "WF", "YT");
    private final Geocoder c;

    public eze(Context context) {
        this.c = new Geocoder(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.jer a(double r9, double r11, java.util.Map r13) {
        /*
            r8 = this;
            r0 = 0
            android.location.Geocoder r1 = r8.c     // Catch: java.io.IOException -> L1a
            r6 = 1
            r2 = r9
            r4 = r11
            java.util.List r9 = r1.getFromLocation(r2, r4, r6)     // Catch: java.io.IOException -> L1a
            if (r9 == 0) goto L2f
            boolean r10 = r9.isEmpty()     // Catch: java.io.IOException -> L1a
            if (r10 != 0) goto L2f
            r10 = 0
            java.lang.Object r9 = r9.get(r10)     // Catch: java.io.IOException -> L1a
            android.location.Address r9 = (android.location.Address) r9     // Catch: java.io.IOException -> L1a
            goto L30
        L1a:
            r9 = move-exception
            r7 = r9
            jnk r9 = defpackage.eze.a
            jnx r1 = r9.f()
            java.lang.String r4 = "getAddress"
            r5 = 63
            java.lang.String r2 = "IOException while reverse geocoding"
            java.lang.String r3 = "com/google/android/apps/adm/util/ReverseGeocoder"
            java.lang.String r6 = "ReverseGeocoder.java"
            defpackage.der.d(r1, r2, r3, r4, r5, r6, r7)
        L2f:
            r9 = r0
        L30:
            if (r9 != 0) goto L33
            goto L37
        L33:
            java.lang.String r0 = r9.getCountryCode()
        L37:
            java.lang.String r9 = "EU"
            if (r0 != 0) goto L3c
            r0 = r9
        L3c:
            java.lang.Object r10 = r13.get(r0)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L59
            jjr r11 = defpackage.eze.b
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r12 = r0.toUpperCase(r12)
            boolean r11 = r11.contains(r12)
            if (r11 == 0) goto L59
            java.lang.Object r9 = r13.get(r9)
            r10 = r9
            java.lang.Integer r10 = (java.lang.Integer) r10
        L59:
            jer r9 = defpackage.jer.h(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eze.a(double, double, java.util.Map):jer");
    }
}
