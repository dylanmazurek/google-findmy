package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwm {
    public int a;
    public boolean b;
    public final Object c;

    public iwm(FloatingActionButton floatingActionButton) {
        this.b = false;
        this.a = 0;
        this.c = floatingActionButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(njz njzVar) {
        if (njzVar != null && ((WeakReference) this.c).get() == njzVar) {
            return true;
        }
        return false;
    }

    public iwm(int i, njz njzVar) {
        this.c = new WeakReference(njzVar);
        this.a = i;
    }
}
