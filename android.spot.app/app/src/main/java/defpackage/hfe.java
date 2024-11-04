package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfe extends hhf {
    public static final Drawable e(Context context) {
        return hog.O(context, R.drawable.og_gm3_list_divider, iqg.k(R.dimen.m3_sys_elevation_level2, context));
    }

    @Override // defpackage.hhf
    protected final int a() {
        return R.attr.ogAccountMenuTheme;
    }

    @Override // defpackage.hhf
    protected final int b() {
        return R.style.OneGoogle_AccountMenu_GoogleMaterial3_DayNight;
    }

    @Override // defpackage.hhf
    public final int c() {
        return R.style.OneGoogle_AccountMenu_Attrs_GoogleMaterial3;
    }

    @Override // defpackage.hhf
    protected final boolean d() {
        return true;
    }
}
