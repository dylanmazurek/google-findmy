package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.amr;
import defpackage.fma;
import defpackage.fwf;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Flag extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new fwf(6);
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;

    public Flag(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
    }

    private static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.a);
        sb.append(", ");
        int i = this.g;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            sb.append("'");
                            byte[] bArr = this.f;
                            fma.aR(bArr);
                            sb.append(Base64.encodeToString(bArr, 3));
                            sb.append("'");
                        } else {
                            throw new AssertionError("Invalid type: " + this.a + ", " + i);
                        }
                    } else {
                        sb.append("'");
                        String str = this.e;
                        fma.aR(str);
                        sb.append(str);
                        sb.append("'");
                    }
                } else {
                    sb.append(this.d);
                }
            } else {
                sb.append(this.c);
            }
        } else {
            sb.append(this.b);
        }
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(")");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.phenotype.Flag r9 = (com.google.android.gms.phenotype.Flag) r9
            java.lang.String r0 = r9.a
            java.lang.String r1 = r8.a
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto Le
            goto La1
        Le:
            int r0 = r8.g
            int r1 = r9.g
            int r1 = b(r0, r1)
            if (r1 == 0) goto L1b
            r0 = r1
            goto La1
        L1b:
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L93
            r4 = 2
            if (r0 == r4) goto L88
            r4 = 3
            if (r0 == r4) goto L7f
            r4 = 4
            if (r0 == r4) goto L6d
            r4 = 5
            if (r0 != r4) goto L61
            byte[] r0 = r8.f
            byte[] r4 = r9.f
            if (r0 != r4) goto L33
            goto L8e
        L33:
            if (r0 != 0) goto L37
            goto L9b
        L37:
            if (r4 != 0) goto L3b
            goto La0
        L3b:
            byte[] r0 = r8.f
            int r0 = r0.length
            byte[] r1 = r9.f
            int r1 = r1.length
            int r0 = java.lang.Math.min(r0, r1)
            if (r2 >= r0) goto L56
            byte[] r0 = r8.f
            r0 = r0[r2]
            byte[] r1 = r9.f
            r1 = r1[r2]
            int r0 = r0 - r1
            if (r0 == 0) goto L53
            goto La1
        L53:
            int r2 = r2 + 1
            goto L3b
        L56:
            byte[] r0 = r8.f
            int r0 = r0.length
            byte[] r9 = r9.f
            int r9 = r9.length
            int r0 = b(r0, r9)
            goto La1
        L61:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r1 = "Invalid enum value: "
            java.lang.String r0 = defpackage.a.ae(r0, r1)
            r9.<init>(r0)
            throw r9
        L6d:
            java.lang.String r0 = r8.e
            java.lang.String r9 = r9.e
            if (r0 != r9) goto L74
            goto L8e
        L74:
            if (r0 != 0) goto L77
            goto L9b
        L77:
            if (r9 != 0) goto L7a
            goto La0
        L7a:
            int r0 = r0.compareTo(r9)
            goto La1
        L7f:
            double r0 = r8.d
            double r2 = r9.d
            int r0 = java.lang.Double.compare(r0, r2)
            goto La1
        L88:
            boolean r0 = r8.c
            boolean r9 = r9.c
            if (r0 != r9) goto L90
        L8e:
            r0 = 0
            goto La1
        L90:
            if (r0 == 0) goto L9b
            goto La0
        L93:
            long r4 = r8.b
            long r6 = r9.b
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L9d
        L9b:
            r0 = -1
            goto La1
        L9d:
            if (r9 != 0) goto La0
            goto L8e
        La0:
            r0 = 1
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.Flag.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof Flag) {
            Flag flag = (Flag) obj;
            if (amr.g(this.a, flag.a) && (i = this.g) == flag.g && this.h == flag.h) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    return Arrays.equals(this.f, flag.f);
                                }
                                throw new AssertionError(a.ae(i, "Invalid enum value: "));
                            }
                            return amr.g(this.e, flag.e);
                        }
                        if (this.d != flag.d) {
                            return false;
                        }
                        return true;
                    }
                    if (this.c != flag.c) {
                        return false;
                    }
                    return true;
                }
                if (this.b == flag.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        String str = this.a;
        if (!fwf.b(str)) {
            fma.X(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            fma.M(parcel, 3, j);
        }
        if (this.c) {
            fma.G(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            fma.J(parcel, 5, d);
        }
        String str2 = this.e;
        if (!fwf.b(str2)) {
            fma.X(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (!fwf.b(bArr)) {
            fma.I(parcel, 7, bArr, false);
        }
        int i2 = this.g;
        if (!fwf.a(i2)) {
            fma.L(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!fwf.a(i3)) {
            fma.L(parcel, 9, i3);
        }
        fma.F(parcel, D);
    }
}
