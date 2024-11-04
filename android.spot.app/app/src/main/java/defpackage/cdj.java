package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdj {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public cdj(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static cdj b(String str) {
        byte[] bytes = (str + (char) 0).getBytes(cdl.g);
        return new cdj(2, bytes.length, bytes);
    }

    public static cdj c(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[cdl.e[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new cdj(4, 1, wrap.array());
    }

    public static cdj d(cdk cdkVar, ByteOrder byteOrder) {
        cdk[] cdkVarArr = {cdkVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[cdl.e[5]]);
        wrap.order(byteOrder);
        cdk cdkVar2 = cdkVarArr[0];
        wrap.putInt((int) cdkVar2.a);
        wrap.putInt((int) cdkVar2.b);
        return new cdj(5, 1, wrap.array());
    }

    public static cdj e(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[cdl.e[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new cdj(3, 1, wrap.array());
    }

    public final int a(ByteOrder byteOrder) {
        Object f = f(byteOrder);
        if (f != null) {
            if (f instanceof String) {
                return Integer.parseInt((String) f);
            }
            if (f instanceof long[]) {
                long[] jArr = (long[]) f;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (f instanceof int[]) {
                int[] iArr = (int[]) f;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0196: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:407), block:B:167:0x0196 */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.nio.ByteOrder r11) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdj.f(java.nio.ByteOrder):java.lang.Object");
    }

    public final String g(ByteOrder byteOrder) {
        Object f = f(byteOrder);
        if (f != null) {
            if (f instanceof String) {
                return (String) f;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (f instanceof long[]) {
                long[] jArr = (long[]) f;
                while (true) {
                    int length = jArr.length;
                    if (i >= length) {
                        break;
                    }
                    sb.append(jArr[i]);
                    i++;
                    if (i != length) {
                        sb.append(",");
                    }
                }
            } else if (f instanceof int[]) {
                int[] iArr = (int[]) f;
                while (true) {
                    int length2 = iArr.length;
                    if (i >= length2) {
                        break;
                    }
                    sb.append(iArr[i]);
                    i++;
                    if (i != length2) {
                        sb.append(",");
                    }
                }
            } else if (f instanceof double[]) {
                double[] dArr = (double[]) f;
                while (true) {
                    int length3 = dArr.length;
                    if (i >= length3) {
                        break;
                    }
                    sb.append(dArr[i]);
                    i++;
                    if (i != length3) {
                        sb.append(",");
                    }
                }
            } else if (f instanceof cdk[]) {
                cdk[] cdkVarArr = (cdk[]) f;
                while (true) {
                    int length4 = cdkVarArr.length;
                    if (i >= length4) {
                        break;
                    }
                    sb.append(cdkVarArr[i].a);
                    sb.append('/');
                    sb.append(cdkVarArr[i].b);
                    i++;
                    if (i != length4) {
                        sb.append(",");
                    }
                }
            } else {
                return null;
            }
            return sb.toString();
        }
        return null;
    }

    public final String toString() {
        return "(" + cdl.d[this.a] + ", data length:" + this.d.length + ")";
    }

    public cdj(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }
}
