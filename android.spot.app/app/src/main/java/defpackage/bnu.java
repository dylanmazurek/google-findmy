package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnu {
    public final boolean a;
    final String b;
    public int c;
    public float d;
    public String e;
    boolean f;
    public int g;
    public final int h;

    public bnu(bnu bnuVar, Object obj) {
        this.a = false;
        this.b = bnuVar.b;
        this.h = bnuVar.h;
        a(obj);
    }

    public final void a(Object obj) {
        int i = this.h;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (i2 != 7) {
                                    this.d = ((Float) obj).floatValue();
                                    return;
                                }
                            } else {
                                this.f = ((Boolean) obj).booleanValue();
                                return;
                            }
                        } else {
                            this.e = (String) obj;
                            return;
                        }
                    } else {
                        this.g = ((Integer) obj).intValue();
                        return;
                    }
                } else {
                    this.d = ((Float) obj).floatValue();
                    return;
                }
            }
            this.c = ((Integer) obj).intValue();
            return;
        }
        throw null;
    }

    public bnu(String str, int i, Object obj, boolean z) {
        this.b = str;
        this.h = i;
        this.a = z;
        a(obj);
    }
}
