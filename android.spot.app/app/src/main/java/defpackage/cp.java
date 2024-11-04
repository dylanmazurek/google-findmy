package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cp {
    public final cl a;
    private final int b;

    public cp(Context context) {
        this(context, cq.a(context, 0));
    }

    public final Context a() {
        return this.a.a;
    }

    public cq b() {
        int i;
        cq cqVar = new cq(this.a.a, this.b);
        co coVar = cqVar.a;
        cl clVar = this.a;
        View view = clVar.f;
        if (view != null) {
            coVar.x = view;
        } else {
            CharSequence charSequence = clVar.e;
            if (charSequence != null) {
                coVar.b(charSequence);
            }
            Drawable drawable = clVar.d;
            if (drawable != null) {
                coVar.t = drawable;
                coVar.s = 0;
                ImageView imageView = coVar.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    coVar.u.setImageDrawable(drawable);
                }
            }
            int i2 = clVar.c;
            if (i2 != 0) {
                coVar.t = null;
                coVar.s = i2;
                ImageView imageView2 = coVar.u;
                if (imageView2 != null) {
                    if (i2 != 0) {
                        imageView2.setVisibility(0);
                        coVar.u.setImageResource(coVar.s);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = clVar.g;
        if (charSequence2 != null) {
            coVar.e = charSequence2;
            TextView textView = coVar.w;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = clVar.h;
        if (charSequence3 != null) {
            coVar.f(-1, charSequence3, clVar.i);
        }
        CharSequence charSequence4 = clVar.j;
        if (charSequence4 != null) {
            coVar.f(-2, charSequence4, clVar.k);
        }
        CharSequence charSequence5 = clVar.l;
        if (charSequence5 != null) {
            coVar.f(-3, charSequence5, clVar.m);
        }
        if (clVar.p != null || clVar.q != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) clVar.b.inflate(coVar.C, (ViewGroup) null);
            if (clVar.t) {
                i = coVar.D;
            } else {
                i = coVar.E;
            }
            ListAdapter listAdapter = clVar.q;
            if (listAdapter == null) {
                listAdapter = new cn(clVar.a, i, clVar.p);
            }
            coVar.y = listAdapter;
            coVar.z = clVar.u;
            if (clVar.r != null) {
                alertController$RecycleListView.setOnItemClickListener(new ck(clVar, coVar));
            }
            if (clVar.t) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            coVar.f = alertController$RecycleListView;
        }
        View view2 = clVar.s;
        if (view2 != null) {
            coVar.g = view2;
            coVar.h = false;
        }
        cqVar.setCancelable(this.a.n);
        if (this.a.n) {
            cqVar.setCanceledOnTouchOutside(true);
        }
        cqVar.setOnCancelListener(null);
        cqVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = this.a.o;
        if (onKeyListener != null) {
            cqVar.setOnKeyListener(onKeyListener);
        }
        return cqVar;
    }

    public final void c(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        cl clVar = this.a;
        clVar.p = charSequenceArr;
        clVar.r = onClickListener;
    }

    public final void d(int i) {
        cl clVar = this.a;
        clVar.g = clVar.a.getText(i);
    }

    public final void e(CharSequence charSequence) {
        this.a.g = charSequence;
    }

    public final void f(int i, DialogInterface.OnClickListener onClickListener) {
        cl clVar = this.a;
        clVar.j = clVar.a.getText(i);
        clVar.k = onClickListener;
    }

    public final void g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        cl clVar = this.a;
        clVar.j = charSequence;
        clVar.k = onClickListener;
    }

    public final void h(DialogInterface.OnClickListener onClickListener) {
        cl clVar = this.a;
        clVar.l = "Clear";
        clVar.m = onClickListener;
    }

    public final void i(int i, DialogInterface.OnClickListener onClickListener) {
        cl clVar = this.a;
        clVar.h = clVar.a.getText(i);
        clVar.i = onClickListener;
    }

    public final void j(int i) {
        cl clVar = this.a;
        clVar.e = clVar.a.getText(i);
    }

    public final void k(CharSequence charSequence) {
        this.a.e = charSequence;
    }

    public final void l(View view) {
        this.a.s = view;
    }

    public cp(Context context, int i) {
        this.a = new cl(new ContextThemeWrapper(context, cq.a(context, i)));
        this.b = i;
    }
}
