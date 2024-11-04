package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfh extends gzp {
    private final jer b;

    public hfh(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, hfs.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
        try {
            obtainStyledAttributes.getColor(4, frx.ai(context, R.color.og_background_light));
            int color = obtainStyledAttributes.getColor(10, frx.ai(context, R.color.og_default_icon_color_light));
            obtainStyledAttributes.getColor(11, frx.ai(context, R.color.og_incognito_top_tight_icon_color_light));
            obtainStyledAttributes.getColor(8, frx.ai(context, R.color.og_menu_title_color_light));
            obtainStyledAttributes.getColor(9, frx.ai(context, R.color.google_white));
            cu.c(context, obtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
            obtainStyledAttributes.recycle();
            this.b = jer.i(new gzn(hog.O(context, R.drawable.ic_camera_18px_obake_icon_14px, color), null, 8));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gzp
    public final void a(Object obj) {
        Object obj2;
        ijs.c();
        if (frx.aq(obj)) {
            obj2 = jer.i(new gzo(this.b, jdl.a));
        } else {
            obj2 = jdl.a;
        }
        this.a.l(obj2);
    }
}
