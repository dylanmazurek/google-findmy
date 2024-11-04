package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrh extends nnw {
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final nrf i;

    private nrh(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, nrf nrfVar) {
        super(str);
        this.e = jArr;
        this.f = iArr;
        this.g = iArr2;
        this.h = strArr;
        this.i = nrfVar;
    }

    public static nrh n(DataInput dataInput, String str) {
        nrf nrfVar;
        int readUnsignedByte;
        int readUnsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        int[] iArr = new int[readInt];
        int[] iArr2 = new int[readInt];
        String[] strArr2 = new String[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = moz.au(dataInput);
            iArr[i2] = (int) moz.au(dataInput);
            iArr2[i2] = (int) moz.au(dataInput);
            if (readUnsignedShort < 256) {
                try {
                    readUnsignedByte = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IOException("Invalid encoding");
                }
            } else {
                readUnsignedByte = dataInput.readUnsignedShort();
            }
            strArr2[i2] = strArr[readUnsignedByte];
        }
        if (dataInput.readBoolean()) {
            nrfVar = new nrf(str, (int) moz.au(dataInput), nri.c(dataInput), nri.c(dataInput));
        } else {
            nrfVar = null;
        }
        return new nrh(str, jArr, iArr, iArr2, strArr2, nrfVar);
    }

    @Override // defpackage.nnw
    public final int a(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.f[binarySearch];
        }
        int i = ~binarySearch;
        if (i < jArr.length) {
            if (i > 0) {
                return this.f[i - 1];
            }
            return 0;
        }
        nrf nrfVar = this.i;
        if (nrfVar == null) {
            return this.f[i - 1];
        }
        return nrfVar.a(j);
    }

    @Override // defpackage.nnw
    public final int c(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.g[binarySearch];
        }
        int i = ~binarySearch;
        if (i < jArr.length) {
            if (i > 0) {
                return this.g[i - 1];
            }
            return 0;
        }
        nrf nrfVar = this.i;
        if (nrfVar == null) {
            return this.g[i - 1];
        }
        return nrfVar.e;
    }

    @Override // defpackage.nnw
    public final long e(long j) {
        int i;
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            i = binarySearch + 1;
        } else {
            i = ~binarySearch;
        }
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        nrf nrfVar = this.i;
        if (nrfVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return nrfVar.e(j);
    }

    @Override // defpackage.nnw
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nrh) {
            nrh nrhVar = (nrh) obj;
            if (this.c.equals(nrhVar.c) && Arrays.equals(this.e, nrhVar.e) && Arrays.equals(this.h, nrhVar.h) && Arrays.equals(this.f, nrhVar.f) && Arrays.equals(this.g, nrhVar.g)) {
                nrf nrfVar = this.i;
                nrf nrfVar2 = nrhVar.i;
                if (nrfVar != null ? nrfVar.equals(nrfVar2) : nrfVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.nnw
    public final long f(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            if (j <= Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return j - 1;
        }
        int i = ~binarySearch;
        if (i < jArr.length) {
            if (i > 0) {
                long j2 = jArr[i - 1];
                if (j2 > Long.MIN_VALUE) {
                    return j2 - 1;
                }
            }
            return j;
        }
        nrf nrfVar = this.i;
        if (nrfVar != null) {
            long f = nrfVar.f(j);
            if (f < j) {
                return f;
            }
        }
        long j3 = jArr[i - 1];
        if (j3 > Long.MIN_VALUE) {
            return j3 - 1;
        }
        return j;
    }

    @Override // defpackage.nnw
    public final String g(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.h[binarySearch];
        }
        int i = ~binarySearch;
        if (i < jArr.length) {
            if (i > 0) {
                return this.h[i - 1];
            }
            return "UTC";
        }
        nrf nrfVar = this.i;
        if (nrfVar == null) {
            return this.h[i - 1];
        }
        return nrfVar.g(j);
    }

    @Override // defpackage.nnw
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.nnw
    public final boolean k() {
        return false;
    }
}
