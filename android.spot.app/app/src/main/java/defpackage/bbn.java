package defpackage;

import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbn {
    public static final bbn a = new bbn();

    private bbn() {
    }

    public final void a(View view, auj aujVar) {
        PointerIcon pointerIcon;
        if (!(aujVar instanceof atw)) {
            PointerIcon systemIcon = aujVar instanceof atx ? PointerIcon.getSystemIcon(view.getContext(), ((atx) aujVar).a) : PointerIcon.getSystemIcon(view.getContext(), 1000);
            pointerIcon = view.getPointerIcon();
            if (amr.i(pointerIcon, systemIcon)) {
                return;
            }
            view.setPointerIcon(systemIcon);
            return;
        }
        throw null;
    }
}
