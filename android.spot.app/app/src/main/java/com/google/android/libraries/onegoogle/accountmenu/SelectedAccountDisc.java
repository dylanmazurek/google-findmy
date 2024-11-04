package com.google.android.libraries.onegoogle.accountmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import defpackage.ecp;
import defpackage.hac;
import defpackage.hbn;
import defpackage.hbo;
import defpackage.hcc;
import defpackage.hog;
import defpackage.hwx;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectedAccountDisc extends FrameLayout {
    public final ImageView a;
    public final AccountParticleDisc b;
    public View.OnTouchListener c;
    public View.OnTouchListener d;
    public hcc e;
    public hac f;

    public SelectedAccountDisc(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new ecp(this, onClickListener, 16));
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.c = onTouchListener;
    }

    public void setScale(float f) {
        AvatarView avatarView = this.b.a;
        AvatarView.b(f, avatarView.e);
        avatarView.f = f;
        avatarView.j();
        avatarView.invalidate();
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        new Rect();
        new WeakReference(null);
        LayoutInflater.from(context).inflate(R.layout.selected_account_disc, (ViewGroup) this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.og_selected_account_disc_apd);
        this.b = accountParticleDisc;
        ImageView imageView = (ImageView) findViewById(R.id.incognito_on_image_view);
        this.a = imageView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hbn.a, i, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            if (dimensionPixelSize != -1) {
                hwx.V(!accountParticleDisc.q(), "setMaxDiscContentSize is only allowed before calling initialize.");
                accountParticleDisc.m(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            int P = hog.P(context);
            if (P != 0) {
                accountParticleDisc.setBackgroundResource(P);
                imageView.setBackgroundResource(P);
            }
            super.setOnTouchListener(new hbo(this, 0));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
