package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzv {
    public static volatile mbg a;

    public static int A(byte[] bArr, int i, lib libVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            libVar.a = b;
            return i2;
        }
        return B(b, bArr, i2, libVar);
    }

    public static int B(int i, byte[] bArr, int i2, lib libVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            libVar.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            libVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            libVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            libVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                libVar.a = i11;
                return i12;
            }
        }
    }

    public static int C(int i, byte[] bArr, int i2, int i3, ljv ljvVar, lib libVar) {
        ljo ljoVar = (ljo) ljvVar;
        int A = A(bArr, i2, libVar);
        ljoVar.g(libVar.a);
        while (A < i3) {
            int A2 = A(bArr, A, libVar);
            if (i != libVar.a) {
                break;
            }
            A = A(bArr, A2, libVar);
            ljoVar.g(libVar.a);
        }
        return A;
    }

    public static int D(byte[] bArr, int i, lib libVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            libVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        libVar.b = j2;
        return i3;
    }

    public static int E(Object obj, llg llgVar, byte[] bArr, int i, int i2, int i3, lib libVar) {
        int c = ((lkt) llgVar).c(obj, bArr, i, i2, i3, libVar);
        libVar.c = obj;
        return c;
    }

    public static int F(Object obj, llg llgVar, byte[] bArr, int i, int i2, lib libVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = B(i4, bArr, i3, libVar);
            i4 = libVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            llgVar.i(obj, bArr, i5, i6, libVar);
            libVar.c = obj;
            return i6;
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int G(int i, byte[] bArr, int i2, int i3, lib libVar) {
        if (llz.a(i) != 0) {
            int b = llz.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 5) {
                                return i2 + 4;
                            }
                            throw new ljy("Protocol message contained an invalid tag (zero).");
                        }
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (i2 < i3) {
                            i2 = A(bArr, i2, libVar);
                            i5 = libVar.a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = G(i5, bArr, i2, i3, libVar);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw new ljy("Failed to parse the message.");
                    }
                    return A(bArr, i2, libVar) + libVar.a;
                }
                return i2 + 8;
            }
            return D(bArr, i2, libVar);
        }
        throw new ljy("Protocol message contained an invalid tag (zero).");
    }

    public static long H(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static final void I(lhr lhrVar, Map map, Map map2) {
        if (map2.containsKey(lhrVar)) {
            Object obj = ((lzl) map2.get(lhrVar)).b;
        } else {
            map.containsKey(lhrVar);
        }
        if (map2.containsKey(lhrVar)) {
            if (((lzl) map2.get(lhrVar)).b != null) {
                boolean z = ((lzl) map2.get(lhrVar)).a;
            }
        } else if (map.containsKey(lhrVar)) {
            boolean z2 = ((lhs) map.get(lhrVar)).c;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:            if (r0.isInfinite() == false) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:            r3 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:            if (((java.lang.Long) r9).longValue() >= 0) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:            if (((java.lang.Integer) r9).intValue() >= 0) goto L45;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void J(defpackage.lhr r8, java.lang.Object r9, java.util.Map r10) {
        /*
            int r0 = r8.aZ
            int r1 = r0 + (-1)
            r2 = 0
            if (r0 == 0) goto L6a
            r3 = 0
            r4 = 1
            switch(r1) {
                case 0: goto L61;
                case 1: goto L4f;
                case 2: goto L45;
                case 3: goto L3a;
                case 4: goto L2c;
                case 5: goto L1c;
                case 6: goto L61;
                case 7: goto L61;
                default: goto Lc;
            }
        Lc:
            java.lang.String r8 = K(r0)
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "Unexpected option type: "
            java.lang.String r8 = r10.concat(r8)
            r9.<init>(r8)
            throw r9
        L1c:
            r0 = r9
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r1 = r0.isNaN()
            if (r1 != 0) goto L56
            boolean r0 = r0.isInfinite()
            if (r0 != 0) goto L56
            goto L43
        L2c:
            r0 = r9
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 < 0) goto L56
            goto L43
        L3a:
            r0 = r9
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L56
        L43:
            r3 = 1
            goto L56
        L45:
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            r3 = r0 ^ 1
            goto L56
        L4f:
            r0 = r9
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
        L56:
            if (r3 != 0) goto L61
            lzl r9 = new lzl
            r9.<init>(r2)
            r10.put(r8, r9)
            return
        L61:
            lzl r0 = new lzl
            r0.<init>(r9)
            r10.put(r8, r0)
            return
        L6a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzv.J(lhr, java.lang.Object, java.util.Map):void");
    }

    public static /* synthetic */ String K(int i) {
        switch (i) {
            case 1:
                return "FIXED_LENGTH_BASE_64";
            case 2:
                return "BOOLEAN";
            case 3:
                return "STRING";
            case 4:
                return "INTEGER";
            case 5:
                return "LONG";
            case 6:
                return "FLOAT";
            case 7:
                return "PREFIX_HEX";
            default:
                return "FIFE_SAFE_BASE_64";
        }
    }

    public static String L(int i) {
        return Integer.toString(a.s(i));
    }

    public static void M(ktd ktdVar, Map.Entry entry) {
        ljm ljmVar = (ljm) entry.getKey();
        llx llxVar = llx.DOUBLE;
        switch (ljmVar.b) {
            case DOUBLE:
                ktdVar.p(ljmVar.a, ((Double) entry.getValue()).doubleValue());
                return;
            case FLOAT:
                ktdVar.t(ljmVar.a, ((Float) entry.getValue()).floatValue());
                return;
            case INT64:
                ktdVar.w(ljmVar.a, ((Long) entry.getValue()).longValue());
                return;
            case UINT64:
                ktdVar.F(ljmVar.a, ((Long) entry.getValue()).longValue());
                return;
            case INT32:
                ktdVar.v(ljmVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case FIXED64:
                ktdVar.s(ljmVar.a, ((Long) entry.getValue()).longValue());
                return;
            case FIXED32:
                ktdVar.r(ljmVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case BOOL:
                ktdVar.n(ljmVar.a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case STRING:
                ktdVar.D(ljmVar.a, (String) entry.getValue());
                return;
            case GROUP:
                ktdVar.u(ljmVar.a, entry.getValue(), lkz.a.a(entry.getValue().getClass()));
                return;
            case MESSAGE:
                ktdVar.x(ljmVar.a, entry.getValue(), lkz.a.a(entry.getValue().getClass()));
                return;
            case BYTES:
                ktdVar.o(ljmVar.a, (lim) entry.getValue());
                return;
            case UINT32:
                ktdVar.E(ljmVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case ENUM:
                ktdVar.v(ljmVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED32:
                ktdVar.z(ljmVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED64:
                ktdVar.A(ljmVar.a, ((Long) entry.getValue()).longValue());
                return;
            case SINT32:
                ktdVar.B(ljmVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case SINT64:
                ktdVar.C(ljmVar.a, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    public static final void a(String str, ljh ljhVar) {
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lcc lccVar = (lcc) ljhVar.b;
        lcc lccVar2 = lcc.l;
        lccVar.a |= 2;
        lccVar.d = str;
    }

    public static int b(int i) {
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        return 0;
                    }
                }
            }
            return i2;
        }
        return 4;
    }

    public static int c(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int d(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            default:
                return 0;
        }
    }

    public static int e(int i) {
        if (i != 0) {
            if (i != 3) {
                if (i != 6) {
                    if (i == 9) {
                        return 10;
                    }
                    if (i != 10) {
                        return 0;
                    }
                    return 11;
                }
                return 7;
            }
            return 4;
        }
        return 1;
    }

    public static int f(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0;
            }
            return 3;
        }
        return 2;
    }

    public static int g(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0;
            }
            return 3;
        }
        return 2;
    }

    public static int h(int i) {
        if (i != 0) {
            if (i != 9) {
                if (i != 10) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        return 3;
    }

    public static ljv i(Object obj, long j) {
        return (ljv) llu.h(obj, j);
    }

    public static final List j(Object obj, long j) {
        int i;
        ljv i2 = i(obj, j);
        if (!i2.c()) {
            int size = i2.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            ljv d = i2.d(i);
            llu.u(obj, j, d);
            return d;
        }
        return i2;
    }

    public static ljd k(Object obj) {
        return ((ljk) obj).l;
    }

    public static ljd l(Object obj) {
        return ((ljk) obj).c();
    }

    public static void m(lir lirVar, Object obj, lja ljaVar, ljd ljdVar) {
        nqe nqeVar = (nqe) obj;
        ljdVar.l((ljm) nqeVar.d, lirVar.t(nqeVar.b.getClass(), ljaVar));
    }

    public static final void n(Object obj) {
        k(obj).e();
    }

    public static final lim o(liv livVar, byte[] bArr) {
        livVar.ag();
        return new lik(bArr);
    }

    public static double p(byte[] bArr, int i) {
        return Double.longBitsToDouble(H(bArr, i));
    }

    public static float q(byte[] bArr, int i) {
        return Float.intBitsToFloat(s(bArr, i));
    }

    public static int r(byte[] bArr, int i, lib libVar) {
        int A = A(bArr, i, libVar);
        int i2 = libVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - A) {
                if (i2 == 0) {
                    libVar.c = lim.b;
                    return A;
                }
                libVar.c = lim.u(bArr, A, i2);
                return A + i2;
            }
            throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int s(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int t(llg llgVar, byte[] bArr, int i, int i2, int i3, lib libVar) {
        Object e = llgVar.e();
        int E = E(e, llgVar, bArr, i, i2, i3, libVar);
        llgVar.g(e);
        libVar.c = e;
        return E;
    }

    public static int u(llg llgVar, byte[] bArr, int i, int i2, lib libVar) {
        Object e = llgVar.e();
        int F = F(e, llgVar, bArr, i, i2, libVar);
        llgVar.g(e);
        libVar.c = e;
        return F;
    }

    public static int v(llg llgVar, int i, byte[] bArr, int i2, int i3, ljv ljvVar, lib libVar) {
        int u = u(llgVar, bArr, i2, i3, libVar);
        ljvVar.add(libVar.c);
        while (u < i3) {
            int A = A(bArr, u, libVar);
            if (i != libVar.a) {
                break;
            }
            u = u(llgVar, bArr, A, i3, libVar);
            ljvVar.add(libVar.c);
        }
        return u;
    }

    public static int w(byte[] bArr, int i, ljv ljvVar, lib libVar) {
        ljo ljoVar = (ljo) ljvVar;
        int A = A(bArr, i, libVar);
        int i2 = libVar.a + A;
        while (A < i2) {
            A = A(bArr, A, libVar);
            ljoVar.g(libVar.a);
        }
        if (A == i2) {
            return A;
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int x(byte[] bArr, int i, lib libVar) {
        int A = A(bArr, i, libVar);
        int i2 = libVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                libVar.c = "";
                return A;
            }
            libVar.c = new String(bArr, A, i2, ljw.a);
            return A + i2;
        }
        throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int y(byte[] bArr, int i, lib libVar) {
        int A = A(bArr, i, libVar);
        int i2 = libVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                libVar.c = "";
                return A;
            }
            libVar.c = kzy.r(bArr, A, i2);
            return A + i2;
        }
        throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int z(int i, byte[] bArr, int i2, int i3, llp llpVar, lib libVar) {
        if (llz.a(i) != 0) {
            int b = llz.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 5) {
                                llpVar.e(i, Integer.valueOf(s(bArr, i2)));
                                return i2 + 4;
                            }
                            throw new ljy("Protocol message contained an invalid tag (zero).");
                        }
                        llp llpVar2 = new llp();
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int A = A(bArr, i2, libVar);
                            int i6 = libVar.a;
                            i5 = i6;
                            if (i6 != i4) {
                                int z = z(i5, bArr, A, i3, llpVar2, libVar);
                                i5 = i6;
                                i2 = z;
                            } else {
                                i2 = A;
                                break;
                            }
                        }
                        if (i2 <= i3 && i5 == i4) {
                            llpVar.e(i, llpVar2);
                            return i2;
                        }
                        throw new ljy("Failed to parse the message.");
                    }
                    int A2 = A(bArr, i2, libVar);
                    int i7 = libVar.a;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - A2) {
                            if (i7 == 0) {
                                llpVar.e(i, lim.b);
                            } else {
                                llpVar.e(i, lim.u(bArr, A2, i7));
                            }
                            return A2 + i7;
                        }
                        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                llpVar.e(i, Long.valueOf(H(bArr, i2)));
                return i2 + 8;
            }
            int D = D(bArr, i2, libVar);
            llpVar.e(i, Long.valueOf(libVar.b));
            return D;
        }
        throw new ljy("Protocol message contained an invalid tag (zero).");
    }
}
