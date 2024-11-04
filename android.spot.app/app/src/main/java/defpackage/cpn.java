package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpn {
    public static final cpn a = box.i(new LinkedHashMap());
    public final Map b;

    public cpn(cpn cpnVar) {
        cpnVar.getClass();
        this.b = new HashMap(cpnVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final cpn a(byte[] bArr) {
        boolean z;
        Object obj;
        bArr.getClass();
        int length = bArr.length;
        if (length <= 10240) {
            if (length == 0) {
                return a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[2];
                byteArrayInputStream.read(bArr2);
                if (bArr2[0] == -84 && bArr2[1] == -19) {
                    z = true;
                } else {
                    z = false;
                }
                byteArrayInputStream.reset();
                if (z) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt = objectInputStream.readInt();
                        for (int i = 0; i < readInt; i++) {
                            String readUTF = objectInputStream.readUTF();
                            readUTF.getClass();
                            linkedHashMap.put(readUTF, objectInputStream.readObject());
                        }
                        mjo.r(objectInputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            mjo.r(objectInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short readShort = dataInputStream.readShort();
                        if (readShort == -21521) {
                            short readShort2 = dataInputStream.readShort();
                            if (readShort2 == 1) {
                                int readInt2 = dataInputStream.readInt();
                                for (int i2 = 0; i2 < readInt2; i2++) {
                                    byte readByte = dataInputStream.readByte();
                                    if (readByte == 0) {
                                        obj = null;
                                    } else if (readByte == 1) {
                                        obj = Boolean.valueOf(dataInputStream.readBoolean());
                                    } else if (readByte == 2) {
                                        obj = Byte.valueOf(dataInputStream.readByte());
                                    } else if (readByte == 3) {
                                        obj = Integer.valueOf(dataInputStream.readInt());
                                    } else if (readByte == 4) {
                                        obj = Long.valueOf(dataInputStream.readLong());
                                    } else if (readByte == 5) {
                                        obj = Float.valueOf(dataInputStream.readFloat());
                                    } else if (readByte == 6) {
                                        obj = Double.valueOf(dataInputStream.readDouble());
                                    } else if (readByte == 7) {
                                        obj = dataInputStream.readUTF();
                                    } else if (readByte == 8) {
                                        int readInt3 = dataInputStream.readInt();
                                        Boolean[] boolArr = new Boolean[readInt3];
                                        for (int i3 = 0; i3 < readInt3; i3++) {
                                            boolArr[i3] = Boolean.valueOf(dataInputStream.readBoolean());
                                        }
                                        obj = (Serializable) boolArr;
                                    } else if (readByte == 9) {
                                        int readInt4 = dataInputStream.readInt();
                                        Byte[] bArr3 = new Byte[readInt4];
                                        for (int i4 = 0; i4 < readInt4; i4++) {
                                            bArr3[i4] = Byte.valueOf(dataInputStream.readByte());
                                        }
                                        obj = (Serializable) bArr3;
                                    } else if (readByte == 10) {
                                        int readInt5 = dataInputStream.readInt();
                                        Integer[] numArr = new Integer[readInt5];
                                        for (int i5 = 0; i5 < readInt5; i5++) {
                                            numArr[i5] = Integer.valueOf(dataInputStream.readInt());
                                        }
                                        obj = (Serializable) numArr;
                                    } else if (readByte == 11) {
                                        int readInt6 = dataInputStream.readInt();
                                        Long[] lArr = new Long[readInt6];
                                        for (int i6 = 0; i6 < readInt6; i6++) {
                                            lArr[i6] = Long.valueOf(dataInputStream.readLong());
                                        }
                                        obj = (Serializable) lArr;
                                    } else if (readByte == 12) {
                                        int readInt7 = dataInputStream.readInt();
                                        Float[] fArr = new Float[readInt7];
                                        for (int i7 = 0; i7 < readInt7; i7++) {
                                            fArr[i7] = Float.valueOf(dataInputStream.readFloat());
                                        }
                                        obj = (Serializable) fArr;
                                    } else if (readByte == 13) {
                                        int readInt8 = dataInputStream.readInt();
                                        Double[] dArr = new Double[readInt8];
                                        for (int i8 = 0; i8 < readInt8; i8++) {
                                            dArr[i8] = Double.valueOf(dataInputStream.readDouble());
                                        }
                                        obj = (Serializable) dArr;
                                    } else if (readByte == 14) {
                                        int readInt9 = dataInputStream.readInt();
                                        String[] strArr = new String[readInt9];
                                        for (int i9 = 0; i9 < readInt9; i9++) {
                                            String readUTF2 = dataInputStream.readUTF();
                                            if (true == amr.i(readUTF2, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                                readUTF2 = null;
                                            }
                                            strArr[i9] = readUTF2;
                                        }
                                        obj = (Serializable) strArr;
                                    } else {
                                        throw new IllegalStateException(a.ae(readByte, "Unsupported type "));
                                    }
                                    String readUTF3 = dataInputStream.readUTF();
                                    readUTF3.getClass();
                                    linkedHashMap.put(readUTF3, obj);
                                }
                                mjo.r(dataInputStream, null);
                            } else {
                                throw new IllegalStateException(a.ae(readShort2, "Unsupported version number: "));
                            }
                        } else {
                            throw new IllegalStateException(a.ae(readShort, "Magic number doesn't match: "));
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            mjo.r(dataInputStream, th3);
                            throw th4;
                        }
                    }
                }
            } catch (IOException e) {
                String str = cpo.a;
                cqc.b();
                Log.e(str, "Error in Data#fromByteArray: ", e);
            } catch (ClassNotFoundException e2) {
                String str2 = cpo.a;
                cqc.b();
                Log.e(str2, "Error in Data#fromByteArray: ", e2);
            }
            return new cpn(linkedHashMap);
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public final String b(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map c() {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(this.b);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final boolean d(String str, Class cls) {
        Object obj = this.b.get(str);
        if (obj != null && cls.isAssignableFrom(obj.getClass())) {
            return true;
        }
        return false;
    }

    public final byte[] e(String str) {
        Object obj = this.b.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!(objArr instanceof Object[])) {
            return null;
        }
        int length = objArr.length;
        bco bcoVar = new bco(obj, 12);
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = ((Number) bcoVar.a(Integer.valueOf(i))).byteValue();
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L69
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            boolean r2 = defpackage.amr.i(r2, r3)
            if (r2 != 0) goto L16
            goto L69
        L16:
            cpn r8 = (defpackage.cpn) r8
            java.util.Map r2 = r7.b
            java.util.Map r3 = r8.b
            java.util.Set r2 = r2.keySet()
            java.util.Set r3 = r3.keySet()
            boolean r3 = defpackage.amr.i(r2, r3)
            if (r3 != 0) goto L2b
            return r1
        L2b:
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r4 = r7.b
            java.lang.Object r4 = r4.get(r3)
            java.util.Map r5 = r8.b
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L65
            if (r3 != 0) goto L4c
            goto L65
        L4c:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L5e
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L5e
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = defpackage.mkm.c(r5, r3)
            goto L62
        L5e:
            boolean r3 = defpackage.amr.i(r4, r3)
        L62:
            if (r3 != 0) goto L2f
            goto L67
        L65:
            if (r4 == r3) goto L2f
        L67:
            return r1
        L68:
            return r0
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                hashCode = Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value);
            } else {
                hashCode = entry.hashCode();
            }
            i += hashCode;
        }
        return i * 31;
    }

    public final String toString() {
        return "Data {" + mkm.ar(this.b.entrySet(), null, null, null, cka.c, 31) + "}";
    }

    public cpn(Map map) {
        this.b = new HashMap(map);
    }
}
