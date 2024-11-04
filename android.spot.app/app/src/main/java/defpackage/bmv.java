package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmv {
    public int b;
    public boolean c;
    public final bmw d;
    public bmv e;
    public bmr h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public bmv(bmw bmwVar, int i) {
        this.d = bmwVar;
        this.i = i;
    }

    public final int a() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public final int b() {
        bmv bmvVar;
        if (this.d.ai == 8) {
            return 0;
        }
        int i = this.g;
        if (i != Integer.MIN_VALUE && (bmvVar = this.e) != null && bmvVar.d.ai == 8) {
            return i;
        }
        return this.f;
    }

    public final bmv c() {
        int i = this.i - 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return this.d.L;
                }
                return this.d.K;
            }
            return this.d.N;
        }
        return this.d.M;
    }

    public final void d(int i, ArrayList arrayList, bnr bnrVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ce.l(((bmv) it.next()).d, i, arrayList, bnrVar);
            }
        }
    }

    public final void e() {
        HashSet hashSet;
        bmv bmvVar = this.e;
        if (bmvVar != null && (hashSet = bmvVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void f(int i) {
        this.b = i;
        this.c = true;
    }

    public final void g(int i) {
        if (j()) {
            this.g = i;
        }
    }

    public final boolean h() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((bmv) it.next()).c().j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        HashSet hashSet = this.a;
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean k(bmv bmvVar) {
        boolean z;
        if (bmvVar == null) {
            return false;
        }
        int i = this.i;
        int i2 = bmvVar.i;
        if (i2 == i) {
            if (i == 6 && (!bmvVar.d.G || !this.d.G)) {
                return false;
            }
            return true;
        }
        int i3 = 9;
        int i4 = 4;
        int i5 = 2;
        switch (i - 1) {
            case 1:
            case 3:
                i3 = 8;
                break;
            case 2:
            case 4:
                i5 = 3;
                i4 = 5;
                break;
            case 5:
                if (i2 == 2 || i2 == 4) {
                    return false;
                }
                return true;
            case 6:
                if (i2 == 6 || i2 == 8 || i2 == 9) {
                    return false;
                }
                return true;
            default:
                return false;
        }
        if (i2 != i5 && i2 != i4) {
            z = false;
        } else {
            z = true;
        }
        if (bmvVar.d instanceof bna) {
            if (!z && i2 != i3) {
                return false;
            }
            return true;
        }
        return z;
    }

    public final void l(bmv bmvVar, int i) {
        n(bmvVar, i, Integer.MIN_VALUE, false);
    }

    public final void m() {
        bmr bmrVar = this.h;
        if (bmrVar == null) {
            this.h = new bmr(1);
        } else {
            bmrVar.c();
        }
    }

    public final void n(bmv bmvVar, int i, int i2, boolean z) {
        if (bmvVar == null) {
            e();
            return;
        }
        if (!z && !k(bmvVar)) {
            return;
        }
        this.e = bmvVar;
        if (bmvVar.a == null) {
            bmvVar.a = new HashSet();
        }
        HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.aj);
        sb.append(":");
        switch (this.i) {
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = "BASELINE";
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        sb.append(str);
        return sb.toString();
    }
}
