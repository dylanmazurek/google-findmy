package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwz {
    public CharSequence a;
    public CharSequence b;
    public View d;
    public TabLayout f;
    public ixb g;
    public int c = -1;
    public final int e = 1;
    public int h = -1;

    public final void a() {
        TabLayout tabLayout = this.f;
        if (tabLayout != null) {
            tabLayout.j(this);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void b() {
        ixb ixbVar = this.g;
        if (ixbVar != null) {
            ixbVar.b();
        }
    }

    public final void c(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(charSequence)) {
            this.g.setContentDescription(charSequence);
        }
        this.a = charSequence;
        b();
    }
}
