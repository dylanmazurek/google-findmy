package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class djb implements dje {
    private final String a;
    private final AssetManager b;
    private Object c;

    public djb(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    protected abstract Object b(AssetManager assetManager, String str);

    @Override // defpackage.dje
    public final void d() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            e(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void e(Object obj);

    @Override // defpackage.dje
    public final void f(dgs dgsVar, djd djdVar) {
        try {
            Object b = b(this.b, this.a);
            this.c = b;
            djdVar.b(b);
        } catch (IOException e) {
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
