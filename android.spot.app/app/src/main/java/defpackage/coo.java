package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coo {
    public cfa a;
    public ViewPager2 b;
    final /* synthetic */ cop c;
    public cly d;
    public eu e;
    private long f = -1;

    public coo(cop copVar) {
        this.c = copVar;
    }

    public static final ViewPager2 b(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        Objects.toString(parent);
        throw new IllegalStateException("Expected ViewPager2 instance. Got: ".concat(String.valueOf(parent)));
    }

    public final void a(boolean z) {
        ag agVar;
        boolean z2;
        if (!this.c.v() && this.b.b() == 0 && !this.c.f.m()) {
            int i = this.b.b;
            cop copVar = this.c;
            if (i < copVar.a()) {
                long j = i;
                if ((j != this.f || z) && (agVar = (ag) copVar.f.e(j)) != null && agVar.au()) {
                    this.f = j;
                    f fVar = new f(this.c.e);
                    ArrayList arrayList = new ArrayList();
                    ag agVar2 = null;
                    for (int i2 = 0; i2 < this.c.f.b(); i2++) {
                        cop copVar2 = this.c;
                        long c = copVar2.f.c(i2);
                        ag agVar3 = (ag) copVar2.f.g(i2);
                        if (agVar3.au()) {
                            if (c != this.f) {
                                fVar.l(agVar3, cew.STARTED);
                                arrayList.add(this.c.k.t());
                            } else {
                                agVar2 = agVar3;
                            }
                            if (c == this.f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            agVar3.am(z2);
                        }
                    }
                    if (agVar2 != null) {
                        fVar.l(agVar2, cew.RESUMED);
                        arrayList.add(this.c.k.t());
                    }
                    if (!fVar.d.isEmpty()) {
                        fVar.b();
                        Collections.reverse(arrayList);
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            bet.u((List) arrayList.get(i3));
                        }
                    }
                }
            }
        }
    }
}
