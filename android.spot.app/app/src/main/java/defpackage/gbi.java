package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbi {
    public final String a;
    public final lkq b;
    public final jue c;
    public final Integer d;
    public final int[] e;
    public final int[] f;
    public final ffh g;
    public final int h;

    public gbi() {
        throw null;
    }

    public static gbh a() {
        gbh gbhVar = new gbh();
        gbhVar.d();
        return gbhVar;
    }

    public final boolean equals(Object obj) {
        jue jueVar;
        Integer num;
        int[] iArr;
        int[] iArr2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gbi) {
            gbi gbiVar = (gbi) obj;
            if (this.a.equals(gbiVar.a) && this.b.equals(gbiVar.b) && ((jueVar = this.c) != null ? jueVar.equals(gbiVar.c) : gbiVar.c == null) && ((num = this.d) != null ? num.equals(gbiVar.d) : gbiVar.d == null)) {
                int i = this.h;
                int i2 = gbiVar.h;
                if (i != 0) {
                    if (i2 == 1) {
                        int[] iArr3 = this.e;
                        boolean z = gbiVar instanceof gbi;
                        if (z) {
                            iArr = gbiVar.e;
                        } else {
                            iArr = gbiVar.e;
                        }
                        if (Arrays.equals(iArr3, iArr)) {
                            int[] iArr4 = this.f;
                            if (z) {
                                iArr2 = gbiVar.f;
                            } else {
                                iArr2 = gbiVar.f;
                            }
                            if (Arrays.equals(iArr4, iArr2)) {
                                ffh ffhVar = this.g;
                                ffh ffhVar2 = gbiVar.g;
                                if (ffhVar != null ? ffhVar.equals(ffhVar2) : ffhVar2 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        jue jueVar = this.c;
        int i2 = 0;
        if (jueVar == null) {
            i = 0;
        } else if (jueVar.y()) {
            i = jueVar.i();
        } else {
            int i3 = jueVar.y;
            if (i3 == 0) {
                i3 = jueVar.i();
                jueVar.y = i3;
            }
            i = i3;
        }
        int i4 = ((hashCode2 * 1000003) ^ i) * 1000003;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        a.V(this.h);
        int hashCode3 = (((((((i4 ^ hashCode) * 583896283) ^ 1) * (-721379959)) ^ Arrays.hashCode(this.e)) * 1000003) ^ Arrays.hashCode(this.f)) * 1000003;
        ffh ffhVar = this.g;
        if (ffhVar != null) {
            i2 = ffhVar.hashCode();
        }
        return hashCode3 ^ i2;
    }

    public final String toString() {
        String str;
        jue jueVar = this.c;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(jueVar);
        if (this.h != 0) {
            str = Integer.toString(a.s(1));
        } else {
            str = "null";
        }
        int[] iArr = this.e;
        int[] iArr2 = this.f;
        ffh ffhVar = this.g;
        return "ClearcutData{logSource=" + this.a + ", message=" + valueOf + ", visualElements=" + valueOf2 + ", eventCode=" + this.d + ", wallTime=null, elapsedTime=null, qosTier=" + str + ", logVerifier=null, experimentIds=" + Arrays.toString(iArr) + ", testCodes=" + Arrays.toString(iArr2) + ", complianceProductData=" + String.valueOf(ffhVar) + "}";
    }

    public gbi(String str, lkq lkqVar, jue jueVar, Integer num, int[] iArr, int[] iArr2, ffh ffhVar) {
        this.a = str;
        this.b = lkqVar;
        this.c = jueVar;
        this.d = num;
        this.h = 1;
        this.e = iArr;
        this.f = iArr2;
        this.g = ffhVar;
    }
}
