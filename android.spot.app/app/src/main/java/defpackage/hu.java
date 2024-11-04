package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hu {
    final njz e;
    private final buf f = new bug(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c = 0;
    final bet d = new bet(this, (byte[]) null);

    public hu(njz njzVar) {
        this.e = njzVar;
    }

    private final int m(int i, int i2) {
        int i3;
        int i4;
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ht htVar = (ht) this.b.get(size);
            int i5 = htVar.a;
            if (i5 == 8) {
                int i6 = htVar.b;
                int i7 = htVar.d;
                if (i6 < i7) {
                    i3 = i7;
                } else {
                    i3 = i6;
                }
                if (i6 < i7) {
                    i4 = i6;
                } else {
                    i4 = i7;
                }
                if (i >= i4 && i <= i3) {
                    if (i4 == i6) {
                        if (i2 == 1) {
                            htVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            htVar.d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            htVar.b = i6 + 1;
                        } else if (i2 == 2) {
                            htVar.b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        htVar.b = i6 + 1;
                        htVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        htVar.b = i6 - 1;
                        htVar.d = i7 - 1;
                    }
                }
            } else {
                int i8 = htVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= htVar.d;
                    } else if (i5 == 2) {
                        i += htVar.d;
                    }
                } else if (i2 == 1) {
                    htVar.b = i8 + 1;
                } else if (i2 == 2) {
                    htVar.b = i8 - 1;
                }
            }
        }
        int size2 = this.b.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ht htVar2 = (ht) this.b.get(size2);
                if (htVar2.a == 8) {
                    int i9 = htVar2.d;
                    if (i9 == htVar2.b || i9 < 0) {
                        this.b.remove(size2);
                        g(htVar2);
                    }
                } else if (htVar2.d <= 0) {
                    this.b.remove(size2);
                    g(htVar2);
                }
            } else {
                return i;
            }
        }
    }

    private final void n(ht htVar) {
        int i;
        int i2 = htVar.a;
        if (i2 != 1 && i2 != 8) {
            int m = m(htVar.b, i2);
            int i3 = htVar.b;
            int i4 = htVar.a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    Objects.toString(htVar);
                    throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(htVar)));
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < htVar.d; i6++) {
                int m2 = m(htVar.b + (i * i6), htVar.a);
                int i7 = htVar.a;
                if (i7 == 2 ? m2 == m : !(i7 != 4 || m2 != m + 1)) {
                    i5++;
                } else {
                    Object obj = htVar.c;
                    ht l = l(i7, m, i5);
                    e(l, i3);
                    g(l);
                    if (htVar.a == 4) {
                        i3 += i5;
                    }
                    m = m2;
                    i5 = 1;
                }
            }
            Object obj2 = htVar.c;
            g(htVar);
            if (i5 > 0) {
                ht l2 = l(htVar.a, m, i5);
                e(l2, i3);
                g(l2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private final void o(ht htVar) {
        this.b.add(htVar);
        int i = htVar.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        this.e.z(htVar.b, htVar.d);
                        return;
                    } else {
                        Objects.toString(htVar);
                        throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(htVar)));
                    }
                }
                njz njzVar = this.e;
                int i2 = htVar.b;
                int i3 = htVar.d;
                Object obj = htVar.c;
                njzVar.B(i2, i3);
                return;
            }
            njz njzVar2 = this.e;
            ((RecyclerView) njzVar2.a).K(htVar.b, htVar.d, false);
            ((RecyclerView) njzVar2.a).N = true;
            return;
        }
        this.e.y(htVar.b, htVar.d);
    }

    private final boolean p(int i) {
        int size = this.b.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            ht htVar = (ht) this.b.get(i2);
            int i4 = htVar.a;
            if (i4 == 8) {
                if (b(htVar.d, i3) == i) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = htVar.b;
                int i6 = htVar.d + i5;
                while (i5 < i6) {
                    if (b(i5, i3) == i) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
            i2 = i3;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return b(i, 0);
    }

    final int b(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            ht htVar = (ht) this.b.get(i2);
            int i3 = htVar.a;
            if (i3 == 8) {
                int i4 = htVar.b;
                if (i4 == i) {
                    i = htVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (htVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = htVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = htVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += htVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.x((ht) this.b.get(i));
        }
        h(this.b);
        this.c = 0;
    }

    public final void d() {
        c();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ht htVar = (ht) this.a.get(i);
            int i2 = htVar.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            this.e.x(htVar);
                            this.e.z(htVar.b, htVar.d);
                        }
                    } else {
                        this.e.x(htVar);
                        njz njzVar = this.e;
                        int i3 = htVar.b;
                        int i4 = htVar.d;
                        Object obj = htVar.c;
                        njzVar.B(i3, i4);
                    }
                } else {
                    this.e.x(htVar);
                    this.e.A(htVar.b, htVar.d);
                }
            } else {
                this.e.x(htVar);
                this.e.y(htVar.b, htVar.d);
            }
        }
        h(this.a);
        this.c = 0;
    }

    final void e(ht htVar, int i) {
        this.e.x(htVar);
        int i2 = htVar.a;
        if (i2 != 2) {
            if (i2 == 4) {
                this.e.B(i, htVar.d);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.e.A(i, htVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0000 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu.f():void");
    }

    public final void g(ht htVar) {
        htVar.c = null;
        this.f.b(htVar);
    }

    final void h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g((ht) list.get(i));
        }
        list.clear();
    }

    public final void i() {
        h(this.a);
        h(this.b);
        this.c = 0;
    }

    public final boolean j(int i) {
        if ((i & this.c) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.a.size() > 0) {
            return true;
        }
        return false;
    }

    public final ht l(int i, int i2, int i3) {
        ht htVar = (ht) this.f.a();
        if (htVar == null) {
            return new ht(i, i2, i3);
        }
        htVar.a = i;
        htVar.b = i2;
        htVar.d = i3;
        htVar.c = null;
        return htVar;
    }
}
