package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edy implements Parcelable, eix {
    public static final Parcelable.Creator CREATOR = new h(15);
    public final String a;
    public final lps b;
    public final lqc c;
    public final boolean d;
    public final Long e;
    public final lim f;
    public final boolean g;
    public final eiv h;
    public final ekl i;
    public final boolean j;

    public edy() {
        this(null, null, null, false, null, null, false, null, null, 511);
    }

    @Override // defpackage.eix
    public final eiv a() {
        return this.h;
    }

    @Override // defpackage.eix
    public final /* synthetic */ eiw b() {
        return new eeh(this);
    }

    @Override // defpackage.eix
    public final ekl c() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edy)) {
            return false;
        }
        edy edyVar = (edy) obj;
        if (amr.i(this.a, edyVar.a) && amr.i(this.b, edyVar.b) && amr.i(this.c, edyVar.c) && this.d == edyVar.d && amr.i(this.e, edyVar.e) && amr.i(this.f, edyVar.f) && this.g == edyVar.g && amr.i(this.h, edyVar.h) && amr.i(this.i, edyVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        int hashCode2;
        String str = this.a;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        lps lpsVar = this.b;
        if (lpsVar == null) {
            i = 0;
        } else if (lpsVar.y()) {
            i = lpsVar.i();
        } else {
            int i4 = lpsVar.y;
            if (i4 == 0) {
                i4 = lpsVar.i();
                lpsVar.y = i4;
            }
            i = i4;
        }
        int i5 = hashCode * 31;
        lqc lqcVar = this.c;
        if (lqcVar == null) {
            i2 = 0;
        } else if (lqcVar.y()) {
            i2 = lqcVar.i();
        } else {
            int i6 = lqcVar.y;
            if (i6 == 0) {
                i6 = lqcVar.i();
                lqcVar.y = i6;
            }
            i2 = i6;
        }
        int i7 = (((((i5 + i) * 31) + i2) * 31) + a.i(this.d)) * 31;
        Long l = this.e;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        lim limVar = this.f;
        if (limVar != null) {
            i3 = limVar.hashCode();
        }
        return ((((((i8 + i3) * 31) + a.i(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "AccessoryLocalDeviceState(currentLocateRequestId=" + this.a + ", cleartextLocation=" + this.b + ", pairedAndroidDevice=" + this.c + ", isConnectedToThisAndroid=" + this.d + ", lastSuccessfulLocationFetchedTimeMillis=" + this.e + ", locationEncryptionKey=" + this.f + ", lastLocateRequestError=" + this.g + ", localDeviceSpotState=" + this.h + ", spotDeviceRingingState=" + this.i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        parcel.getClass();
        parcel.writeString(this.a);
        lps lpsVar = this.b;
        byte[] bArr2 = null;
        if (lpsVar != null) {
            bArr = lpsVar.g();
        } else {
            bArr = null;
        }
        parcel.writeByteArray(bArr);
        lqc lqcVar = this.c;
        if (lqcVar != null) {
            bArr2 = lqcVar.g();
        }
        parcel.writeByteArray(bArr2);
        parcel.writeInt(this.d ? 1 : 0);
        Long l = this.e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeSerializable(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
    }

    public edy(String str, lps lpsVar, lqc lqcVar, boolean z, Long l, lim limVar, boolean z2, eiv eivVar, ekl eklVar) {
        eivVar.getClass();
        eklVar.getClass();
        this.a = str;
        this.b = lpsVar;
        this.c = lqcVar;
        this.d = z;
        this.e = l;
        this.f = limVar;
        this.g = z2;
        this.h = eivVar;
        this.i = eklVar;
        boolean z3 = true;
        if (str == null && !eivVar.f.g()) {
            z3 = false;
        }
        this.j = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ edy(java.lang.String r12, defpackage.lps r13, defpackage.lqc r14, boolean r15, java.lang.Long r16, defpackage.lim r17, boolean r18, defpackage.eiv r19, defpackage.ekl r20, int r21) {
        /*
            r11 = this;
            r0 = r21
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto Lf
            eiu r1 = defpackage.eiv.c()
            eiv r1 = r1.a()
            goto L11
        Lf:
            r1 = r19
        L11:
            r2 = r0 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L1e
            ekk r2 = defpackage.ekl.a()
            ekl r2 = r2.a()
            goto L20
        L1e:
            r2 = r20
        L20:
            r3 = r0 & 64
            r4 = r0 & 32
            r5 = r0 & 16
            r6 = r0 & 8
            r7 = r0 & 4
            r8 = r0 & 2
            r9 = 0
            r10 = 1
            if (r3 == 0) goto L32
            r3 = 0
            goto L33
        L32:
            r3 = 1
        L33:
            if (r6 == 0) goto L36
            goto L37
        L36:
            r9 = 1
        L37:
            r0 = r0 & r10
            r3 = r3 & r18
            r6 = 0
            if (r4 == 0) goto L3f
            r4 = r6
            goto L41
        L3f:
            r4 = r17
        L41:
            if (r5 == 0) goto L45
            r5 = r6
            goto L47
        L45:
            r5 = r16
        L47:
            r9 = r9 & r15
            if (r7 == 0) goto L4c
            r7 = r6
            goto L4d
        L4c:
            r7 = r14
        L4d:
            if (r8 == 0) goto L51
            r8 = r6
            goto L52
        L51:
            r8 = r13
        L52:
            if (r10 != r0) goto L55
            goto L56
        L55:
            r6 = r12
        L56:
            r12 = r11
            r13 = r6
            r14 = r8
            r15 = r7
            r16 = r9
            r17 = r5
            r18 = r4
            r19 = r3
            r20 = r1
            r21 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edy.<init>(java.lang.String, lps, lqc, boolean, java.lang.Long, lim, boolean, eiv, ekl, int):void");
    }
}
