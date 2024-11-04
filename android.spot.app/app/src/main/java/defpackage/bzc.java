package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzc {
    public static final void a(ckh ckhVar, Object[] objArr) {
        long j;
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    ckhVar.f(i);
                } else if (obj instanceof byte[]) {
                    ckhVar.c(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    ckhVar.d(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    ckhVar.d(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    ckhVar.e(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    ckhVar.e(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    ckhVar.e(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    ckhVar.e(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    ckhVar.g(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (true != ((Boolean) obj).booleanValue()) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                    ckhVar.e(i, j);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
            }
        }
    }
}
