package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.TextualCardRootView;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hdn extends hcv {
    public TextualCardRootView A;
    public ImageView B;
    public ImageView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public Chip G;
    public Chip H;
    public ImageView I;
    public ImageView J;
    public ImageView K;
    public TextView L;
    public TextView M;
    public ViewGroup N;
    public View.OnClickListener O;
    public View.OnClickListener P;
    public boolean Q;
    public boolean R;
    public boolean S;
    private ViewGroup T;
    private ViewGroup U;
    private View V;
    private View W;
    private ViewGroup X;
    private boolean Y;
    private final int x;
    private final int y;
    public final int z;

    public hdn(ViewGroup viewGroup, Context context, hjp hjpVar) {
        super(viewGroup, context, hjpVar);
        this.z = frx.Y(context, R.attr.ogIconColor);
        this.x = context.getResources().getDimensionPixelSize(R.dimen.account_menu_cards_vertical_spacing);
        this.y = context.getResources().getDimensionPixelSize(R.dimen.text_card_vertical_spacing_with_actions);
    }

    private final void I() {
        this.G.setClickable(false);
        this.G.setFocusable(false);
    }

    public static void O(TextView textView, hdf hdfVar) {
        String str = (String) hdfVar.b.f();
        textView.setText(hdfVar.a);
        textView.setContentDescription(str);
    }

    private static final void P(TextualCardRootView textualCardRootView, hdj hdjVar) {
        jer jerVar;
        if (textualCardRootView != null) {
            if (hdjVar != null) {
                jerVar = jer.i(hdjVar.v);
            } else {
                jerVar = jdl.a;
            }
            textualCardRootView.a = jerVar;
        }
    }

    private static final void Q(ViewGroup viewGroup, hdj hdjVar) {
        Integer num;
        if (viewGroup != null) {
            if (hdjVar != null) {
                num = (Integer) hdjVar.u.f();
            } else {
                num = null;
            }
            viewGroup.setTag(R.id.og_card_highlight_id_tag, num);
        }
    }

    protected View E(ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hcv
    public void F(cfc cfcVar) {
        this.A.cU(this.s);
        super.F(cfcVar);
        hdj hdjVar = (hdj) this.w;
        hdjVar.getClass();
        hdjVar.i.k(cfcVar);
        hdjVar.j.k(cfcVar);
        hdjVar.k.k(cfcVar);
        hdjVar.l.k(cfcVar);
        hdjVar.m.k(cfcVar);
        hdjVar.n.k(cfcVar);
        hdjVar.p.k(cfcVar);
        hdjVar.r.k(cfcVar);
        hdjVar.q.k(cfcVar);
        hdjVar.o.k(cfcVar);
        hdjVar.s.k(cfcVar);
        hdjVar.b.k(cfcVar);
        if (this.Y) {
            hdjVar.t.k(cfcVar);
        }
        if (hdjVar instanceof hda) {
            ((hda) hdjVar).f();
        }
        hdjVar.i();
    }

    @Override // defpackage.hcv
    protected final void G(ViewGroup viewGroup, ViewGroup viewGroup2) {
        boolean z;
        this.X = viewGroup2;
        View inflate = LayoutInflater.from(((hcv) this).r).inflate(R.layout.og_textual_card, viewGroup);
        this.A = (TextualCardRootView) inflate.findViewById(R.id.og_text_card_root);
        this.T = (ViewGroup) inflate.findViewById(R.id.og_full_text_card_root);
        this.U = (ViewGroup) inflate.findViewById(R.id.og_minimized_text_card_root);
        this.B = (ImageView) inflate.findViewById(R.id.og_text_card_icon);
        this.C = (ImageView) inflate.findViewById(R.id.og_minimized_text_card_icon);
        this.D = (TextView) inflate.findViewById(R.id.og_text_card_title);
        this.E = (TextView) inflate.findViewById(R.id.og_minimized_text_card_title);
        this.F = (TextView) inflate.findViewById(R.id.og_text_card_subtitle);
        this.G = (Chip) inflate.findViewById(R.id.og_text_card_action);
        this.V = inflate.findViewById(R.id.og_text_actions_top_margin);
        this.W = inflate.findViewById(R.id.og_text_cards_flow);
        this.H = (Chip) inflate.findViewById(R.id.og_text_card_secondary_action);
        this.I = (ImageView) inflate.findViewById(R.id.og_text_card_trail_image);
        this.J = (ImageView) inflate.findViewById(R.id.og_text_card_trail_title_image);
        this.K = (ImageView) inflate.findViewById(R.id.og_minimized_text_card_trail_title_image);
        this.L = (TextView) inflate.findViewById(R.id.og_text_card_trail_title_text);
        this.M = (TextView) inflate.findViewById(R.id.og_text_card_trail_caption_text);
        this.N = (ViewGroup) inflate.findViewById(R.id.og_text_card_custom_content);
        if (hog.I(((hcv) this).r)) {
            I();
        }
        P(this.A, (hdj) this.w);
        Q(viewGroup2, (hdj) this.w);
        if (E(this.N) != null) {
            z = true;
        } else {
            z = false;
        }
        this.Y = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hcv
    public void H(cfc cfcVar, hdj hdjVar) {
        super.H(cfcVar, hdjVar);
        boolean z = hdjVar instanceof hda;
        this.Q = z;
        Q(this.X, hdjVar);
        P(this.A, hdjVar);
        this.A.b(this.s);
        hdjVar.i.g(cfcVar, new hdm(this, 2));
        hdjVar.j.g(cfcVar, new hdm(this, 6));
        hdjVar.k.g(cfcVar, new hdm(this, 7));
        hdjVar.l.g(cfcVar, new hdm(this, 8));
        hdjVar.m.g(cfcVar, new euc(this, 17));
        hdjVar.n.g(cfcVar, new euc(this, 18));
        hdjVar.p.g(cfcVar, new euc(this, 19));
        hdjVar.r.g(cfcVar, new euc(this, 20));
        hdjVar.q.g(cfcVar, new hdm(this, 1));
        hdjVar.o.g(cfcVar, new hdm(this, 0));
        hdjVar.s.g(cfcVar, new hdm(this, 3));
        if (this.Y) {
            hdjVar.t.g(cfcVar, new hdm(this, 4));
        }
        hdjVar.b.g(cfcVar, new hdm(this, 5));
        if (z) {
            ((hda) hdjVar).e();
        } else {
            this.T.setVisibility(0);
            this.U.setVisibility(8);
            this.E.setVisibility(8);
        }
        hdjVar.h();
    }

    public final ColorStateList J(jer jerVar) {
        if (jerVar.g()) {
            return (ColorStateList) jerVar.c();
        }
        return bqx.e(((hcv) this).r, R.color.og_chip_assistive_text_color);
    }

    public final void K(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (onClickListener == null) {
            onClickListener = null;
            if (onClickListener2 != null && !hog.I(((hcv) this).r)) {
                onClickListener = onClickListener2;
            }
        }
        if (onClickListener != null) {
            this.G.setOnClickListener(new ecp(this, onClickListener, 19));
        } else {
            I();
        }
    }

    public final void L() {
        int i;
        int i2 = 0;
        if (this.G.getVisibility() == 8 && this.H.getVisibility() == 8) {
            i2 = 8;
        }
        this.W.setVisibility(i2);
        this.V.setVisibility(i2);
        ViewGroup viewGroup = this.T;
        int paddingLeft = viewGroup.getPaddingLeft();
        int paddingTop = this.T.getPaddingTop();
        int paddingRight = this.T.getPaddingRight();
        if (i2 == 0) {
            i = this.y;
        } else {
            i = this.x;
        }
        viewGroup.setPadding(paddingLeft, paddingTop, paddingRight, i);
    }

    public final void M(ImageView imageView, jer jerVar, int i) {
        int i2;
        if (true != jerVar.g()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        if (!jerVar.g()) {
            return;
        }
        imageView.setImageDrawable(((hdp) jerVar.c()).a(((hcv) this).r, i));
        imageView.setContentDescription((CharSequence) ((hdp) jerVar.c()).c.f());
    }

    public final void N(boolean z) {
        if (this.S && z) {
            this.H.setVisibility(0);
        } else {
            this.H.setVisibility(8);
        }
        L();
    }
}
