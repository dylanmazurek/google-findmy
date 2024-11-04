package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hic {
    public Context a;
    public hih b;
    public hbc c;
    public ExecutorService d;
    public gzf e;
    public hiw f;
    public gee g;
    public hjp h;
    public hhg i;
    public jer j;

    public hic() {
        throw null;
    }

    public final hhg a() {
        hhg hhgVar = this.i;
        if (hhgVar != null) {
            return hhgVar;
        }
        throw new IllegalStateException("Property \"accountLayer\" has not been set");
    }

    public final jer b() {
        ExecutorService executorService = this.d;
        if (executorService == null) {
            return jdl.a;
        }
        return jer.i(executorService);
    }

    public final void c(ExecutorService executorService) {
        if (executorService != null) {
            this.d = executorService;
            return;
        }
        throw new NullPointerException("Null backgroundExecutor");
    }

    public hic(byte[] bArr) {
        this.j = jdl.a;
    }
}
