package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anf implements Iterable, mpq {
    public static final anf a = new anf(0, 0, 0, null);
    public final long b;
    public final long c;
    public final int d;
    public final int[] e;

    private anf(long j, long j2, int i, int[] iArr) {
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = iArr;
    }

    public final anf a(anf anfVar) {
        anf anfVar2 = a;
        if (anfVar == anfVar2) {
            return this;
        }
        if (this == anfVar2) {
            return anfVar2;
        }
        int i = anfVar.d;
        int i2 = this.d;
        if (i == i2) {
            int[] iArr = anfVar.e;
            int[] iArr2 = this.e;
            if (iArr == iArr2) {
                return new anf((~anfVar.b) & this.b, this.c & (~anfVar.c), i2, iArr2);
            }
        }
        int[] iArr3 = anfVar.e;
        anf anfVar3 = this;
        if (iArr3 != null) {
            for (int i3 : iArr3) {
                anfVar3 = anfVar3.b(i3);
            }
        }
        if (anfVar.c != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((anfVar.c & (1 << i4)) != 0) {
                    anfVar3 = anfVar3.b(anfVar.d + i4);
                }
            }
        }
        if (anfVar.b != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if ((anfVar.b & (1 << i5)) != 0) {
                    anfVar3 = anfVar3.b(i5 + 64 + anfVar.d);
                }
            }
        }
        return anfVar3;
    }

    public final anf b(int i) {
        int[] iArr;
        int a2;
        int[] iArr2;
        int i2 = this.d;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.c;
            if ((j2 & j) != 0) {
                return new anf(this.b, (~j) & j2, i2, this.e);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new anf(j4 & (~j3), this.c, i2, this.e);
            }
        } else if (i3 < 0 && (iArr = this.e) != null && (a2 = ang.a(iArr, i)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                iArr2 = null;
            } else {
                int[] iArr3 = new int[i4];
                if (a2 > 0) {
                    mkm.p(iArr, iArr3, 0, 0, a2);
                }
                if (a2 < i4) {
                    mkm.p(iArr, iArr3, a2, a2 + 1, length);
                }
                iArr2 = iArr3;
            }
            return new anf(this.b, this.c, this.d, iArr2);
        }
        return this;
    }

    public final anf c(anf anfVar) {
        anf anfVar2 = a;
        if (anfVar == anfVar2) {
            return this;
        }
        if (this == anfVar2) {
            return anfVar;
        }
        int i = anfVar.d;
        int i2 = this.d;
        if (i == i2) {
            int[] iArr = anfVar.e;
            int[] iArr2 = this.e;
            if (iArr == iArr2) {
                return new anf(anfVar.b | this.b, anfVar.c | this.c, i2, iArr2);
            }
        }
        int i3 = 0;
        if (this.e == null) {
            if (this.c != 0) {
                for (int i4 = 0; i4 < 64; i4++) {
                    if ((this.c & (1 << i4)) != 0) {
                        anfVar = anfVar.d(this.d + i4);
                    }
                }
            }
            anf anfVar3 = anfVar;
            if (this.b != 0) {
                while (i3 < 64) {
                    if ((this.b & (1 << i3)) != 0) {
                        anfVar3 = anfVar3.d(i3 + 64 + this.d);
                    }
                    i3++;
                }
                return anfVar3;
            }
            return anfVar3;
        }
        int[] iArr3 = anfVar.e;
        anf anfVar4 = this;
        if (iArr3 != null) {
            for (int i5 : iArr3) {
                anfVar4 = anfVar4.d(i5);
            }
        }
        if (anfVar.c != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                if ((anfVar.c & (1 << i6)) != 0) {
                    anfVar4 = anfVar4.d(anfVar.d + i6);
                }
            }
        }
        if (anfVar.b != 0) {
            while (i3 < 64) {
                if ((anfVar.b & (1 << i3)) != 0) {
                    anfVar4 = anfVar4.d(i3 + 64 + anfVar.d);
                }
                i3++;
            }
            return anfVar4;
        }
        return anfVar4;
    }

    public final anf d(int i) {
        int i2;
        int[] iArr;
        int i3 = this.d;
        int i4 = i - i3;
        long j = 0;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.c;
            if ((j3 & j2) == 0) {
                return new anf(this.b, j3 | j2, i3, this.e);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.b;
            if ((j5 & j4) == 0) {
                return new anf(j5 | j4, this.c, i3, this.e);
            }
        } else if (i4 >= 128) {
            if (!e(i)) {
                long j6 = this.b;
                long j7 = this.c;
                int i5 = this.d;
                int i6 = ((i + 1) / 64) * 64;
                ArrayList arrayList = null;
                long j8 = j7;
                long j9 = j6;
                while (true) {
                    if (i5 < i6) {
                        if (j8 != j) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                int[] iArr2 = this.e;
                                if (iArr2 != null) {
                                    for (int i7 : iArr2) {
                                        arrayList.add(Integer.valueOf(i7));
                                    }
                                }
                            }
                            for (int i8 = 0; i8 < 64; i8++) {
                                if (((1 << i8) & j8) != 0) {
                                    arrayList.add(Integer.valueOf(i8 + i5));
                                }
                            }
                            j = 0;
                        }
                        if (j9 == j) {
                            i2 = i6;
                            j8 = j;
                            break;
                        }
                        i5 += 64;
                        j8 = j9;
                        j9 = j;
                    } else {
                        i2 = i5;
                        break;
                    }
                }
                if (arrayList != null) {
                    iArr = mkm.am(arrayList);
                } else {
                    iArr = this.e;
                }
                return new anf(j9, j8, i2, iArr).d(i);
            }
        } else {
            int[] iArr3 = this.e;
            if (iArr3 == null) {
                return new anf(this.b, this.c, i3, new int[]{i});
            }
            int a2 = ang.a(iArr3, i);
            if (a2 < 0) {
                int length = iArr3.length;
                int[] iArr4 = new int[length + 1];
                int i9 = -(a2 + 1);
                mkm.p(iArr3, iArr4, 0, 0, i9);
                mkm.p(iArr3, iArr4, i9 + 1, i9, length);
                iArr4[i9] = i;
                return new anf(this.b, this.c, this.d, iArr4);
            }
        }
        return this;
    }

    public final boolean e(int i) {
        int[] iArr;
        int i2 = i - this.d;
        if (i2 >= 0 && i2 < 64) {
            if (((1 << i2) & this.c) != 0) {
                return true;
            }
            return false;
        }
        if (i2 >= 64 && i2 < 128) {
            if (((1 << (i2 - 64)) & this.b) != 0) {
                return true;
            }
            return false;
        }
        if (i2 <= 0 && (iArr = this.e) != null && ang.a(iArr, i) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bwu(new ane(this, null), 3).a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(mkm.ap(this));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb2.append(((Character) obj).charValue());
                } else {
                    sb2.append((CharSequence) obj.toString());
                }
            } else {
                sb2.append((CharSequence) obj);
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
