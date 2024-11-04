package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmg implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final cmd a;
    final ViewGroup b;

    public cmg(cmd cmdVar, ViewGroup viewGroup) {
        this.a = cmdVar;
        this.b = viewGroup;
    }

    private final void a() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e9 A[EDGE_INSN: B:120:0x01e9->B:121:0x01e9 BREAK  A[LOOP:1: B:16:0x008f->B:27:0x01e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x029d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmg.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        cmh.a.remove(this.b);
        ArrayList arrayList = (ArrayList) cmh.a().get(this.b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((cmd) arrayList.get(i)).t(this.b);
            }
        }
        this.a.o(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
