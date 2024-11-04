package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jeb implements jet {
    public static jeb j(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new jdo(charSequence);
                }
                return new jdu(charSequence.charAt(0), charSequence.charAt(1));
            }
            return new jdt(charSequence.charAt(0));
        }
        return jdy.a;
    }

    public static String l(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    private static jeb m(int i, BitSet bitSet, String str) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                int i3 = 2;
                if (i != 2) {
                    int length = bitSet.length();
                    if (i <= 1023 && length > i * 64) {
                        int cardinality = bitSet.cardinality();
                        boolean z = bitSet.get(0);
                        if (cardinality != 1) {
                            int highestOneBit = Integer.highestOneBit(cardinality - 1);
                            i3 = highestOneBit + highestOneBit;
                            while (i3 * 0.5d < cardinality) {
                                i3 += i3;
                            }
                        }
                        char[] cArr = new char[i3];
                        int i4 = i3 - 1;
                        int nextSetBit = bitSet.nextSetBit(0);
                        long j = 0;
                        while (nextSetBit != -1) {
                            long j2 = (1 << nextSetBit) | j;
                            int m = jev.m(nextSetBit);
                            while (true) {
                                i2 = m & i4;
                                if (cArr[i2] == 0) {
                                    break;
                                }
                                m = i2 + 1;
                            }
                            cArr[i2] = (char) nextSetBit;
                            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
                            j = j2;
                        }
                        return new jev(cArr, j, z, str);
                    }
                    return new jdq(bitSet, str);
                }
                char nextSetBit2 = (char) bitSet.nextSetBit(0);
                return new jdu(nextSetBit2, (char) bitSet.nextSetBit(nextSetBit2 + 1));
            }
            return new jdt((char) bitSet.nextSetBit(0));
        }
        return jdy.a;
    }

    @Override // defpackage.jet
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return c(((Character) obj).charValue());
    }

    public void b(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (c((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public abstract boolean c(char c);

    public jeb d() {
        return k();
    }

    public jeb e(jeb jebVar) {
        return new jdz(this, jebVar);
    }

    public boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (c(charSequence.charAt(length)));
        return false;
    }

    public boolean g(CharSequence charSequence) {
        if (h(charSequence) == -1) {
            return true;
        }
        return false;
    }

    public int h(CharSequence charSequence) {
        return i(charSequence, 0);
    }

    public int i(CharSequence charSequence, int i) {
        int length = charSequence.length();
        hwx.aa(i, length);
        while (i < length) {
            if (c(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final jeb k() {
        String concat;
        BitSet bitSet = new BitSet();
        b(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality + cardinality <= 65536) {
            return m(cardinality, bitSet, toString());
        }
        bitSet.flip(0, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        int i = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE - cardinality;
        String jebVar = toString();
        if (jebVar.endsWith(".negate()")) {
            concat = jebVar.substring(0, jebVar.length() - 9);
        } else {
            concat = String.valueOf(jebVar).concat(".negate()");
        }
        return new jdn(m(i, bitSet, concat), jebVar);
    }
}
