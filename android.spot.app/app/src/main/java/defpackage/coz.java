package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coz extends LinearLayoutManager {
    final /* synthetic */ ViewPager2 a;

    public coz(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutManager
    public final void Q(me meVar, int[] iArr) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.h == -1) {
            super.Q(meVar, iArr);
            return;
        }
        RecyclerView recyclerView = viewPager2.e;
        if (viewPager2.a() == 0) {
            recyclerView.getWidth();
            recyclerView.getPaddingLeft();
            recyclerView.getPaddingRight();
        } else {
            recyclerView.getHeight();
            recyclerView.getPaddingTop();
            recyclerView.getPaddingBottom();
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // defpackage.lr
    public final boolean aY(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.lr
    public final void cJ(lw lwVar, me meVar, View view, byn bynVar) {
        int i;
        int i2;
        cpc cpcVar = (cpc) this.a.j;
        if (cpcVar.a.a() == 1) {
            i = LinearLayoutManager.be(view);
        } else {
            i = 0;
        }
        if (cpcVar.a.a() == 0) {
            i2 = LinearLayoutManager.be(view);
        } else {
            i2 = 0;
        }
        bynVar.w(bym.a(i, 1, i2, 1, false));
    }
}
