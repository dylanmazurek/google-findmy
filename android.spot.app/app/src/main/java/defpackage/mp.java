package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mp {
    public int a = 0;
    public int b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public final void a(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        this.c = i;
        this.d = i2;
        this.h = true;
        boolean z3 = this.g;
        boolean z4 = false;
        if (i2 != Integer.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (i == Integer.MIN_VALUE) {
            z4 = true;
        }
        if (true != z3) {
            z2 = z4;
        } else {
            z2 = z;
        }
        if (true != z3) {
            i3 = i;
        } else {
            i3 = i2;
        }
        if (true == z3) {
            z = z4;
        }
        if (true != z3) {
            i = i2;
        }
        if (true != z2) {
            this.a = i3;
        }
        if (true != z) {
            this.b = i;
        }
    }
}
