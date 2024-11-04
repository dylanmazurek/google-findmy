package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.adm.R;
import defpackage.ite;
import defpackage.itf;
import defpackage.itg;
import defpackage.itr;
import defpackage.itt;
import defpackage.iub;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CircularProgressIndicator extends ite {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.ite
    public final /* synthetic */ itf a(Context context, AttributeSet attributeSet) {
        return new itr(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        itg itgVar = new itg((itr) this.a);
        setIndeterminateDrawable(iub.b(getContext(), (itr) this.a, itgVar));
        setProgressDrawable(new itt(getContext(), (itr) this.a, itgVar));
    }
}
