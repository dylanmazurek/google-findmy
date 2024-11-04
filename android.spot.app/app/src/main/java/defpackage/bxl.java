package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxl extends WindowInsetsAnimation.Callback {
    private final bxf a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public bxl(bxf bxfVar) {
        super(0);
        this.d = new HashMap();
        this.a = bxfVar;
    }

    private final lrs a(WindowInsetsAnimation windowInsetsAnimation) {
        lrs lrsVar = (lrs) this.d.get(windowInsetsAnimation);
        if (lrsVar == null) {
            lrs lrsVar2 = new lrs(windowInsetsAnimation);
            this.d.put(windowInsetsAnimation, lrsVar2);
            return lrsVar2;
        }
        return lrsVar;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.a();
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.b();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation m226m = qh$$ExternalSyntheticApiModelOutline0.m226m(list.get(size));
                lrs a = a(m226m);
                fraction = m226m.getFraction();
                a.g(fraction);
                this.c.add(a);
            } else {
                bxf bxfVar = this.a;
                bya m = bya.m(windowInsets);
                bxfVar.c(this.b);
                return m.e();
            }
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        bxe bxeVar = new bxe(bounds);
        this.a.d();
        return new WindowInsetsAnimation.Bounds(bxeVar.a.a(), bxeVar.b.a());
    }
}
