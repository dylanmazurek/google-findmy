package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ez {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final ey d;
    private final int e;
    private final int f;

    public ez(ey eyVar, List list, int[] iArr, int[] iArr2) {
        jbc jbcVar;
        int i;
        int i2;
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = eyVar;
        int b = eyVar.b();
        this.e = b;
        int a = eyVar.a();
        this.f = a;
        if (list.isEmpty()) {
            jbcVar = null;
        } else {
            jbcVar = (jbc) list.get(0);
        }
        if (jbcVar == null || jbcVar.b != 0 || jbcVar.c != 0) {
            list.add(0, new jbc(0, 0, 0, null));
        }
        list.add(new jbc(b, a, 0, null));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jbc jbcVar2 = (jbc) it.next();
            for (int i3 = 0; i3 < jbcVar2.a; i3++) {
                int i4 = jbcVar2.b + i3;
                int i5 = jbcVar2.c + i3;
                if (true != this.d.c(i4, i5)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                this.b[i4] = (i5 << 4) | i2;
                this.c[i5] = (i4 << 4) | i2;
            }
        }
        int i6 = 0;
        for (jbc jbcVar3 : this.a) {
            while (i6 < jbcVar3.b) {
                if (this.b[i6] == 0) {
                    int size = this.a.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (i7 < size) {
                            jbc jbcVar4 = (jbc) this.a.get(i7);
                            while (i8 < jbcVar4.c) {
                                if (this.c[i8] == 0 && this.d.d(i6, i8)) {
                                    if (true != this.d.c(i6, i8)) {
                                        i = 4;
                                    } else {
                                        i = 8;
                                    }
                                    this.b[i6] = (i8 << 4) | i;
                                    this.c[i8] = i | (i6 << 4);
                                } else {
                                    i8++;
                                }
                            }
                            i8 = jbcVar4.b();
                            i7++;
                        }
                    }
                }
                i6++;
            }
            i6 = jbcVar3.a();
        }
    }

    private static fb b(Collection collection, int i, boolean z) {
        fb fbVar;
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                fbVar = (fb) it.next();
                if (fbVar.a == i && fbVar.c == z) {
                    it.remove();
                    break;
                }
            } else {
                fbVar = null;
                break;
            }
        }
        while (it.hasNext()) {
            fb fbVar2 = (fb) it.next();
            if (z) {
                fbVar2.b--;
            } else {
                fbVar2.b++;
            }
        }
        return fbVar;
    }

    public final void a(ff ffVar) {
        int i;
        int i2;
        int i3;
        ex exVar = new ex(ffVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        int i4 = this.f;
        int i5 = this.e;
        int i6 = i5;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            jbc jbcVar = (jbc) this.a.get(size);
            int a = jbcVar.a();
            int b = jbcVar.b();
            while (true) {
                if (i6 <= a) {
                    break;
                }
                int i7 = i6 - 1;
                int i8 = this.b[i7];
                if ((i8 & 12) != 0) {
                    int i9 = i8 >> 4;
                    fb b2 = b(arrayDeque, i9, false);
                    if (b2 != null) {
                        int i10 = (i5 - b2.b) - 1;
                        exVar.d(i7, i10);
                        if ((i8 & 4) != 0) {
                            this.d.e(i7, i9);
                            exVar.e(i10);
                        }
                    } else {
                        arrayDeque.add(new fb(i7, (i5 - i7) - 1, true));
                    }
                } else {
                    if (exVar.b == 2 && (i3 = exVar.c) >= i7 && i3 <= i6) {
                        exVar.d++;
                        exVar.c = i7;
                    } else {
                        exVar.c();
                        exVar.c = i7;
                        exVar.d = 1;
                        exVar.b = 2;
                    }
                    i5--;
                }
                i6 = i7;
            }
            while (i4 > b) {
                i4--;
                int i11 = this.c[i4];
                if ((i11 & 12) != 0) {
                    int i12 = i11 >> 4;
                    if (b(arrayDeque, i12, true) == null) {
                        arrayDeque.add(new fb(i4, i5 - i6, false));
                    } else {
                        exVar.d((i5 - r12.b) - 1, i6);
                        if ((i11 & 4) != 0) {
                            this.d.e(i12, i4);
                            exVar.e(i6);
                        }
                    }
                } else {
                    if (exVar.b == 1 && i6 >= (i2 = exVar.c)) {
                        int i13 = exVar.d;
                        if (i6 <= i2 + i13) {
                            exVar.d = i13 + 1;
                            exVar.c = Math.min(i6, i2);
                            i5++;
                        }
                    }
                    exVar.c();
                    exVar.c = i6;
                    exVar.d = 1;
                    exVar.b = 1;
                    i5++;
                }
            }
            int i14 = jbcVar.b;
            int i15 = jbcVar.c;
            for (i = 0; i < jbcVar.a; i++) {
                if ((this.b[i14] & 15) == 2) {
                    this.d.e(i14, i15);
                    exVar.e(i14);
                }
                i14++;
                i15++;
            }
            i6 = jbcVar.b;
            i4 = jbcVar.c;
        }
        exVar.c();
    }
}
