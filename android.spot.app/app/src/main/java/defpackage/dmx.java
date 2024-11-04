package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmx implements dje {
    private final Resources.Theme a;
    private final Resources b;
    private final dmy c;
    private final int d;
    private Object e;

    public dmx(Resources.Theme theme, Resources resources, dmy dmyVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = dmyVar;
        this.d = i;
    }

    @Override // defpackage.dje
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.dje
    public final void d() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.dje
    public final void f(dgs dgsVar, djd djdVar) {
        try {
            Object c = this.c.c(this.a, this.b, this.d);
            this.e = c;
            djdVar.b(c);
        } catch (Resources.NotFoundException e) {
            djdVar.e(e);
        }
    }

    @Override // defpackage.dje
    public final int g() {
        return 1;
    }

    @Override // defpackage.dje
    public final void cr() {
    }
}
