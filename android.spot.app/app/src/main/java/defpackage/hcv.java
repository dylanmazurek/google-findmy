package defpackage;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.DynamicCardRootView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hcv extends mh {
    public final Context r;
    public final hjp s;
    public final DynamicCardRootView t;
    public final View u;
    public final ViewGroup v;
    public hcu w;

    public hcv(ViewGroup viewGroup, Context context, hjp hjpVar) {
        super(LayoutInflater.from(context).inflate(R.layout.og_dynamic_card, viewGroup, false));
        this.r = context;
        this.s = hjpVar;
        DynamicCardRootView dynamicCardRootView = (DynamicCardRootView) this.b.findViewById(R.id.og_card);
        this.t = dynamicCardRootView;
        dynamicCardRootView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup viewGroup2 = (ViewGroup) dynamicCardRootView.findViewById(R.id.og_card_content_root);
        this.v = viewGroup2;
        View findViewById = dynamicCardRootView.findViewById(R.id.og_loading_card_view);
        this.u = findViewById;
        H(dynamicCardRootView, this.w);
        G(viewGroup2, dynamicCardRootView);
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_icon_placeholder)).setImageDrawable(E(new OvalShape()));
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_title_placeholder)).setImageDrawable(E(new RoundRectShape(null, null, null)));
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_progress_placeholder)).setImageDrawable(E(new RoundRectShape(null, null, null)));
        ((ImageView) findViewById.findViewById(R.id.og_loading_card_progress_desc_placeholder)).setImageDrawable(E(new RoundRectShape(null, null, null)));
        findViewById.setContentDescription(findViewById.getResources().getString(R.string.og_card_loading_label_a11y));
    }

    private final PaintDrawable E(Shape shape) {
        Integer num = (Integer) hhd.b(this.r).b.get(hhc.COLOR_HAIRLINE);
        num.getClass();
        PaintDrawable paintDrawable = new PaintDrawable(num.intValue());
        paintDrawable.setShape(shape);
        paintDrawable.setIntrinsicWidth(-1);
        paintDrawable.setIntrinsicHeight(-1);
        return paintDrawable;
    }

    private static final void H(DynamicCardRootView dynamicCardRootView, hcu hcuVar) {
        jer jerVar;
        if (dynamicCardRootView != null) {
            if (hcuVar != null) {
                jerVar = jer.i(Integer.valueOf(hcuVar.f));
            } else {
                jerVar = jdl.a;
            }
            dynamicCardRootView.i = jerVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D(cfc cfcVar, hcu hcuVar) {
        this.w = hcuVar;
        H(this.t, hcuVar);
        this.t.b(this.s);
        hcuVar.a(cfcVar);
        hcuVar.b.g(cfcVar, new euc(this, 13));
        hcuVar.c.g(cfcVar, new euc(this, 14));
        hcuVar.d.g(cfcVar, new euc(this, 15));
        this.t.post(new ci(this, hcuVar, cfcVar, 19));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(cfc cfcVar) {
        this.t.cU(this.s);
        hcu hcuVar = this.w;
        hcuVar.getClass();
        hcuVar.d();
        this.w.b.k(cfcVar);
        this.w.c.k(cfcVar);
        this.w.d.k(cfcVar);
        this.w.e.k(cfcVar);
    }

    protected abstract void G(ViewGroup viewGroup, ViewGroup viewGroup2);
}
