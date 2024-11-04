package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmh {
    private static final cmd b = new cmk(null);
    private static final ThreadLocal c = new ThreadLocal();
    public static final ArrayList a = new ArrayList();

    public static rx a() {
        rx rxVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (rxVar = (rx) weakReference.get()) != null) {
            return rxVar;
        }
        rx rxVar2 = new rx();
        threadLocal.set(new WeakReference(rxVar2));
        return rxVar2;
    }

    public static void b(ViewGroup viewGroup, cmd cmdVar) {
        ArrayList arrayList = a;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (cmdVar == null) {
                cmdVar = b;
            }
            cmd clone = cmdVar.clone();
            ArrayList arrayList2 = (ArrayList) a().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((cmd) arrayList2.get(i)).s(viewGroup);
                }
            }
            if (clone != null) {
                clone.n(viewGroup, true);
            }
            if (((bzv) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (clone != null && viewGroup != null) {
                    cmg cmgVar = new cmg(clone, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(cmgVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(cmgVar);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
