package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.ewd;
import defpackage.fma;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ewd(15);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    public PlayLoggerContext(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayLoggerContext) {
            PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
            if (amr.g(this.a, playLoggerContext.a) && this.b == playLoggerContext.b && this.c == playLoggerContext.c && amr.g(this.f, playLoggerContext.f) && amr.g(this.d, playLoggerContext.d) && this.e == playLoggerContext.e && this.g == playLoggerContext.g && this.h == playLoggerContext.h && amr.g(this.i, playLoggerContext.i) && this.j == playLoggerContext.j && this.k == playLoggerContext.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.f, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.X(parcel, 2, this.a);
        fma.L(parcel, 3, this.b);
        fma.L(parcel, 4, this.c);
        fma.X(parcel, 5, this.d);
        fma.G(parcel, 7, this.e);
        fma.X(parcel, 8, this.f);
        fma.G(parcel, 9, this.g);
        fma.L(parcel, 10, this.h);
        fma.T(parcel, 11, this.i);
        fma.G(parcel, 12, this.j);
        fma.L(parcel, 13, this.k);
        fma.F(parcel, D);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PlayLoggerContext(java.lang.String r15, int r16, java.lang.String r17, java.lang.String r18, defpackage.ffm r19) {
        /*
            r14 = this;
            r0 = r19
            ffn r1 = defpackage.ffn.ANDROID_ID
            boolean r7 = r0.a(r1)
            ffm r1 = defpackage.ffm.b
            boolean r9 = r0.equals(r1)
            ffm r1 = defpackage.ffm.a
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L19
            r0 = 0
            r13 = 0
            goto L32
        L19:
            jjr r0 = r0.d
            jmw r0 = r0.listIterator()
            r1 = -1
        L20:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r0.next()
            ffn r2 = (defpackage.ffn) r2
            int r2 = r2.e
            int r2 = ~r2
            r1 = r1 & r2
            goto L20
        L31:
            r13 = r1
        L32:
            r11 = 0
            r12 = 0
            r5 = -1
            r10 = 0
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.clearcut.internal.PlayLoggerContext.<init>(java.lang.String, int, java.lang.String, java.lang.String, ffm):void");
    }
}
