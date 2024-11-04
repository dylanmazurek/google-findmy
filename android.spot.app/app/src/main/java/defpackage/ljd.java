package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljd {
    public static final ljd a = new ljd(null);
    final lll b = new lll();
    public boolean c;
    private boolean d;

    private ljd() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    public static int a(llx llxVar, int i, Object obj) {
        int Y = liv.Y(i);
        if (llxVar == llx.GROUP) {
            ljw.c((lkq) obj);
            Y += Y;
        }
        lly llyVar = lly.INT;
        int i2 = 4;
        switch (llxVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                i2 = 8;
                return Y + i2;
            case FLOAT:
                ((Float) obj).floatValue();
                return Y + i2;
            case INT64:
                i2 = liv.ac(((Long) obj).longValue());
                return Y + i2;
            case UINT64:
                i2 = liv.ac(((Long) obj).longValue());
                return Y + i2;
            case INT32:
                i2 = liv.L(((Integer) obj).intValue());
                return Y + i2;
            case FIXED64:
                ((Long) obj).longValue();
                i2 = 8;
                return Y + i2;
            case FIXED32:
                ((Integer) obj).intValue();
                return Y + i2;
            case BOOL:
                ((Boolean) obj).booleanValue();
                i2 = 1;
                return Y + i2;
            case STRING:
                i2 = obj instanceof lim ? liv.H((lim) obj) : liv.X((String) obj);
                return Y + i2;
            case GROUP:
                i2 = ((lkq) obj).j();
                return Y + i2;
            case MESSAGE:
                i2 = obj instanceof lkd ? liv.O((lkd) obj) : liv.Q((lkq) obj);
                return Y + i2;
            case BYTES:
                i2 = obj instanceof lim ? liv.H((lim) obj) : liv.P(((byte[]) obj).length);
                return Y + i2;
            case UINT32:
                i2 = liv.aa(((Integer) obj).intValue());
                return Y + i2;
            case ENUM:
                i2 = obj instanceof ljp ? liv.L(((ljp) obj).a()) : liv.L(((Integer) obj).intValue());
                return Y + i2;
            case SFIXED32:
                ((Integer) obj).intValue();
                return Y + i2;
            case SFIXED64:
                ((Long) obj).longValue();
                i2 = 8;
                return Y + i2;
            case SINT32:
                i2 = liv.T(((Integer) obj).intValue());
                return Y + i2;
            case SINT64:
                i2 = liv.V(((Long) obj).longValue());
                return Y + i2;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void g(liv livVar, llx llxVar, int i, Object obj) {
        if (llxVar != llx.GROUP) {
            livVar.A(i, llxVar.t);
            lly llyVar = lly.INT;
            switch (llxVar) {
                case DOUBLE:
                    livVar.aj(((Double) obj).doubleValue());
                    return;
                case FLOAT:
                    livVar.al(((Float) obj).floatValue());
                    return;
                case INT64:
                    livVar.E(((Long) obj).longValue());
                    return;
                case UINT64:
                    livVar.E(((Long) obj).longValue());
                    return;
                case INT32:
                    livVar.t(((Integer) obj).intValue());
                    return;
                case FIXED64:
                    livVar.r(((Long) obj).longValue());
                    return;
                case FIXED32:
                    livVar.p(((Integer) obj).intValue());
                    return;
                case BOOL:
                    livVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case STRING:
                    if (obj instanceof lim) {
                        livVar.n((lim) obj);
                        return;
                    } else {
                        livVar.z((String) obj);
                        return;
                    }
                case GROUP:
                    livVar.am((lkq) obj);
                    return;
                case MESSAGE:
                    livVar.v((lkq) obj);
                    return;
                case BYTES:
                    if (obj instanceof lim) {
                        livVar.n((lim) obj);
                        return;
                    } else {
                        byte[] bArr = (byte[]) obj;
                        livVar.F(bArr, bArr.length);
                        return;
                    }
                case UINT32:
                    livVar.C(((Integer) obj).intValue());
                    return;
                case ENUM:
                    if (obj instanceof ljp) {
                        livVar.t(((ljp) obj).a());
                        return;
                    } else {
                        livVar.t(((Integer) obj).intValue());
                        return;
                    }
                case SFIXED32:
                    livVar.p(((Integer) obj).intValue());
                    return;
                case SFIXED64:
                    livVar.r(((Long) obj).longValue());
                    return;
                case SINT32:
                    livVar.ao(((Integer) obj).intValue());
                    return;
                case SINT64:
                    livVar.aq(((Long) obj).longValue());
                    return;
                default:
                    return;
            }
        }
        lkq lkqVar = (lkq) obj;
        ljw.c(lkqVar);
        livVar.A(i, 3);
        livVar.am(lkqVar);
        livVar.A(i, 4);
    }

    public static int j(ljm ljmVar, Object obj) {
        return a(ljmVar.b, ljmVar.a, obj);
    }

    private static Object n(Object obj) {
        if (obj instanceof lkv) {
            return ((lkv) obj).c();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private static boolean o(Map.Entry entry) {
        if (((ljm) entry.getKey()).a() != lly.MESSAGE) {
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof lkr) {
            return ((lkr) value).u();
        }
        if (value instanceof lkd) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int b(Map.Entry entry) {
        int Z;
        int Y;
        ljm ljmVar = (ljm) entry.getKey();
        Object value = entry.getValue();
        if (ljmVar.a() == lly.MESSAGE) {
            if (value instanceof lkd) {
                int i = ((ljm) entry.getKey()).a;
                int Y2 = liv.Y(1);
                Z = Y2 + Y2 + liv.Z(2, i);
                Y = liv.N(3, (lkd) value);
            } else {
                int i2 = ((ljm) entry.getKey()).a;
                int Y3 = liv.Y(1);
                Z = Y3 + Y3 + liv.Z(2, i2);
                Y = liv.Y(3) + liv.Q((lkq) value);
            }
            return Z + Y;
        }
        return j(ljmVar, value);
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ljd clone() {
        ljd ljdVar = new ljd();
        for (int i = 0; i < this.b.a(); i++) {
            Map.Entry e = this.b.e(i);
            ljdVar.l((ljm) e.getKey(), e.getValue());
        }
        for (Map.Entry entry : this.b.b()) {
            ljdVar.l((ljm) entry.getKey(), entry.getValue());
        }
        ljdVar.d = this.d;
        return ljdVar;
    }

    public final Iterator d() {
        if (h()) {
            return Collections.emptyIterator();
        }
        if (this.d) {
            return new lkc(this.b.entrySet().iterator());
        }
        return this.b.entrySet().iterator();
    }

    public final void e() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.c) {
            for (int i = 0; i < this.b.a(); i++) {
                Map.Entry e = this.b.e(i);
                if (e.getValue() instanceof ljn) {
                    ((ljn) e.getValue()).t();
                }
            }
            lll lllVar = this.b;
            if (!lllVar.c) {
                for (int i2 = 0; i2 < lllVar.a(); i2++) {
                }
                Iterator it = lllVar.b().iterator();
                while (it.hasNext()) {
                }
            }
            if (!lllVar.c) {
                if (lllVar.b.isEmpty()) {
                    unmodifiableMap = Collections.emptyMap();
                } else {
                    unmodifiableMap = DesugarCollections.unmodifiableMap(lllVar.b);
                }
                lllVar.b = unmodifiableMap;
                if (lllVar.d.isEmpty()) {
                    unmodifiableMap2 = Collections.emptyMap();
                } else {
                    unmodifiableMap2 = DesugarCollections.unmodifiableMap(lllVar.d);
                }
                lllVar.d = unmodifiableMap2;
                lllVar.c = true;
            }
            this.c = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljd)) {
            return false;
        }
        return this.b.equals(((ljd) obj).b);
    }

    public final void f(Map.Entry entry) {
        ljm ljmVar = (ljm) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof lkd;
        if (ljmVar.a() == lly.MESSAGE) {
            Object k = k(ljmVar);
            if (k == null) {
                this.b.put(ljmVar, n(value));
                if (z) {
                    this.d = true;
                    return;
                }
                return;
            }
            if (!z) {
                if (!(k instanceof lkv)) {
                    lkp cR = ((lkq) k).cR();
                    ((ljh) cR).w((ljn) ((lkq) value));
                    this.b.put(ljmVar, cR.q());
                    return;
                }
                throw new UnsupportedOperationException();
            }
            throw null;
        }
        if (!z) {
            this.b.put(ljmVar, n(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return this.b.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        for (int i = 0; i < this.b.a(); i++) {
            if (!o(this.b.e(i))) {
                return false;
            }
        }
        Iterator it = this.b.b().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object k(ljm ljmVar) {
        Object obj = this.b.get(ljmVar);
        if (!(obj instanceof lkd)) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:            if ((r7 instanceof defpackage.ljp) == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:            if ((r7 instanceof byte[]) == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:            if (r0 == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:            if ((r7 instanceof defpackage.lkd) == false) goto L32;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.ljm r6, java.lang.Object r7) {
        /*
            r5 = this;
            defpackage.ljw.b(r7)
            llx r0 = defpackage.llx.DOUBLE
            lly r0 = defpackage.lly.INT
            llx r0 = r6.b
            lly r0 = r0.s
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L26;
                case 7: goto L1d;
                case 8: goto L14;
                default: goto L13;
            }
        L13:
            goto L4e
        L14:
            boolean r0 = r7 instanceof defpackage.lkq
            if (r0 != 0) goto L42
            boolean r0 = r7 instanceof defpackage.lkd
            if (r0 == 0) goto L4e
            goto L42
        L1d:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L42
            boolean r0 = r7 instanceof defpackage.ljp
            if (r0 == 0) goto L4e
            goto L42
        L26:
            boolean r0 = r7 instanceof defpackage.lim
            if (r0 != 0) goto L42
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L4e
            goto L42
        L2f:
            boolean r0 = r7 instanceof java.lang.String
            goto L40
        L32:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L40
        L35:
            boolean r0 = r7 instanceof java.lang.Double
            goto L40
        L38:
            boolean r0 = r7 instanceof java.lang.Float
            goto L40
        L3b:
            boolean r0 = r7 instanceof java.lang.Long
            goto L40
        L3e:
            boolean r0 = r7 instanceof java.lang.Integer
        L40:
            if (r0 == 0) goto L4e
        L42:
            boolean r0 = r7 instanceof defpackage.lkd
            if (r0 == 0) goto L48
            r5.d = r1
        L48:
            lll r0 = r5.b
            r0.put(r6, r7)
            return
        L4e:
            int r0 = r6.a
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            llx r6 = r6.b
            lly r6 = r6.s
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r3[r1] = r6
            r6 = 2
            r3[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r2.<init>(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljd.l(ljm, java.lang.Object):void");
    }

    public final boolean m(ljm ljmVar) {
        if (this.b.get(ljmVar) != null) {
            return true;
        }
        return false;
    }

    private ljd(byte[] bArr) {
        e();
        e();
    }
}
