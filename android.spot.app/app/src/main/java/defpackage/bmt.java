package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmt extends bnb {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    public final int a() {
        int i = this.a;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f4, code lost:            if (r6 != false) goto L216;     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00f8, code lost:            if (r7 != false) goto L216;     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    @Override // defpackage.bmw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.bmo r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmt.b(bmo, boolean):void");
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.aK;
            if (i4 >= i) {
                break;
            }
            bmw bmwVar = this.aJ[i4];
            if ((this.b || bmwVar.d()) && ((((i2 = this.a) == 0 || i2 == 1) && !bmwVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !bmwVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.aK; i6++) {
            bmw bmwVar2 = this.aJ[i6];
            if (this.b || bmwVar2.d()) {
                if (!z2) {
                    int i7 = this.a;
                    if (i7 == 0) {
                        i5 = bmwVar2.M(2).a();
                    } else if (i7 == 1) {
                        i5 = bmwVar2.M(4).a();
                    } else if (i7 == 2) {
                        i5 = bmwVar2.M(3).a();
                    } else if (i7 == 3) {
                        i5 = bmwVar2.M(5).a();
                    }
                }
                int i8 = this.a;
                if (i8 == 0) {
                    i5 = Math.min(i5, bmwVar2.M(2).a());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, bmwVar2.M(4).a());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, bmwVar2.M(3).a());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, bmwVar2.M(5).a());
                }
                z2 = true;
            }
        }
        int i9 = i5 + this.c;
        int i10 = this.a;
        if (i10 != 0 && i10 != 1) {
            y(i9, i9);
        } else {
            x(i9, i9);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.bmw
    public final boolean d() {
        return true;
    }

    @Override // defpackage.bmw
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.bmw
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.bmw
    public final String toString() {
        String str = "[Barrier] " + this.aj + " {";
        for (int i = 0; i < this.aK; i++) {
            bmw bmwVar = this.aJ[i];
            if (i > 0) {
                str = str.concat(", ");
            }
            str = str.concat(String.valueOf(bmwVar.aj));
        }
        return str.concat("}");
    }
}
