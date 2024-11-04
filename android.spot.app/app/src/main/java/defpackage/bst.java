package defpackage;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bst {
    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }

    public static final void c(cgk cgkVar, cjy cjyVar, cex cexVar) {
        cexVar.getClass();
        cgb cgbVar = (cgb) cgkVar.q("androidx.lifecycle.savedstate.vm.tag");
        if (cgbVar != null && !cgbVar.b) {
            cgbVar.b(cjyVar, cexVar);
            d(cjyVar, cexVar);
        }
    }

    public static final void d(cjy cjyVar, cex cexVar) {
        cew cewVar = cexVar.b;
        if (cewVar != cew.INITIALIZED && !cewVar.a(cew.STARTED)) {
            cexVar.a(new cok(cexVar, cjyVar, 1));
        } else {
            cjyVar.c(cet.class);
        }
    }
}
