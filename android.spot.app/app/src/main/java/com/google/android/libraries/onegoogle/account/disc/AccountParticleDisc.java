package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.frx;
import defpackage.gcb;
import defpackage.gno;
import defpackage.gze;
import defpackage.gzf;
import defpackage.gzn;
import defpackage.gzo;
import defpackage.gzq;
import defpackage.gzr;
import defpackage.gzt;
import defpackage.gzy;
import defpackage.had;
import defpackage.hae;
import defpackage.haf;
import defpackage.hai;
import defpackage.hha;
import defpackage.hjp;
import defpackage.hog;
import defpackage.hwx;
import defpackage.ijs;
import defpackage.jdl;
import defpackage.jer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AccountParticleDisc extends FrameLayout {
    public final AvatarView a;
    public final BadgeFrameLayout b;
    public final RingFrameLayout c;
    public final haf d;
    public gzy e;
    public hai f;
    public boolean g;
    public boolean h;
    public gzf i;
    public gzt j;
    public Object k;
    public gzr l;
    public jer m;
    public final hha n;
    private final boolean o;
    private final CopyOnWriteArrayList p;
    private final gzq q;
    private final boolean r;
    private final int s;
    private hjp t;
    private jer u;

    public AccountParticleDisc(Context context) {
        this(context, null);
    }

    public static gzn b(gzr gzrVar) {
        gzo gzoVar;
        if (gzrVar != null && (gzoVar = gzrVar.a) != null) {
            return (gzn) gzoVar.a.f();
        }
        return null;
    }

    private final void t() {
        hjp hjpVar = this.t;
        if (hjpVar != null) {
            gzy gzyVar = this.e;
            if (gzyVar != null) {
                gzyVar.c = hjpVar;
                if (gzyVar.e != null) {
                    gzyVar.a.cU(hjpVar);
                    gzyVar.a.c(hjpVar, gzyVar.e);
                }
            }
            hai haiVar = this.f;
            if (haiVar != null) {
                hjp hjpVar2 = this.t;
                haiVar.d = hjpVar2;
                if (haiVar.c != null) {
                    haiVar.b.cU(hjpVar2);
                    haiVar.b.c(hjpVar2, haiVar.c);
                }
            }
        }
    }

    public final int a() {
        return this.a.d;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gzt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [gzt, java.lang.Object] */
    public final jer c() {
        ijs.c();
        if (this.h) {
            hha hhaVar = this.n;
            ijs.c();
            Object obj = hhaVar.c;
            if (obj == null) {
                return jdl.a;
            }
            ?? r2 = hhaVar.d;
            if (r2 != 0) {
                jer a = hha.a(r2.a(obj));
                if (a.g()) {
                    return a;
                }
            }
            ?? r1 = hhaVar.b;
            if (r1 != 0) {
                return hha.a(r1.a(hhaVar.c));
            }
        }
        return jdl.a;
    }

    public final String d() {
        if (this.m.g()) {
            return ((hae) this.m.c()).a;
        }
        return null;
    }

    public final void e(gze gzeVar) {
        this.p.add(gzeVar);
    }

    public final void f(hjp hjpVar) {
        if (this.g || this.h) {
            this.t = hjpVar;
            t();
            if (this.g) {
                this.b.d();
                this.b.b(hjpVar);
            }
            if (this.h) {
                this.c.d();
                this.c.b(hjpVar);
            }
        }
    }

    public final void g() {
        if (this.g) {
            return;
        }
        hwx.V(!q(), "enableBadges is only allowed before calling initialize.");
        this.g = true;
    }

    public final void h() {
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((gze) it.next()).a();
        }
    }

    public final void i(gze gzeVar) {
        this.p.remove(gzeVar);
    }

    public final void j(Object obj) {
        hog.H(new gno(this, obj, 4));
    }

    public final void k() {
        AvatarView avatarView = this.a;
        avatarView.setImageDrawable(avatarView.c);
        this.a.g(true);
    }

    public final void l(gzt gztVar) {
        hwx.V(this.g, "setDecorationRetriever is not allowed with false allowBadges.");
        this.j = gztVar;
        o();
        if (this.h) {
            hog.H(new gno(this, gztVar, 3));
        }
        n();
        h();
    }

    public final void m(int i) {
        int i2;
        int dimension;
        hwx.V(!q(), "setMaxDiscContentSize is only allowed before calling initialize.");
        this.u = jer.i(Integer.valueOf(i));
        if (!this.g && !this.h && !this.o) {
            dimension = 0;
        } else {
            Resources resources = getResources();
            if (i > getResources().getDimension(R.dimen.og_apd_min_avatar_size_for_large_ring)) {
                i2 = R.dimen.og_apd_min_padding_large_ring;
            } else {
                i2 = R.dimen.og_apd_min_padding;
            }
            dimension = (int) resources.getDimension(i2);
        }
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        AvatarView avatarView = this.a;
        int i3 = i - (dimension + dimension);
        avatarView.h = true;
        avatarView.i(i3);
        avatarView.e(i3);
    }

    public final void n() {
        hog.H(new gcb(this, 10));
    }

    public final void o() {
        Object obj;
        gzr gzrVar = this.l;
        if (gzrVar != null) {
            gzrVar.b(this.q);
        }
        gzt gztVar = this.j;
        gzr gzrVar2 = null;
        if (gztVar != null && (obj = this.k) != null) {
            gzrVar2 = gztVar.a(obj);
        }
        this.l = gzrVar2;
        if (gzrVar2 != null) {
            gzrVar2.a(this.q);
        }
    }

    public final void p() {
        ijs.c();
        jer c = c();
        if (c.equals(this.m)) {
            return;
        }
        this.m = c;
        hai haiVar = this.f;
        if (haiVar != null) {
            ijs.c();
            haiVar.a(c, true);
        }
        h();
    }

    public final boolean q() {
        if (this.i != null) {
            return true;
        }
        return false;
    }

    public final void r() {
        if (this.h) {
            return;
        }
        hwx.V(!q(), "setAllowRings is only allowed before calling initialize.");
        this.h = true;
    }

    public final void s(gzf gzfVar, frx frxVar) {
        gzfVar.getClass();
        this.i = gzfVar;
        if (this.r && this.u.g()) {
            int intValue = this.s - ((Integer) this.u.c()).intValue();
            int paddingLeft = (intValue - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (intValue - getPaddingTop()) - getPaddingBottom();
            int max = Math.max(0, (int) Math.ceil(paddingLeft / 2.0f));
            int max2 = Math.max(0, (int) Math.ceil(paddingTop / 2.0f));
            setPadding(getPaddingLeft() + max, getPaddingTop() + max2, getPaddingRight() + max, getPaddingBottom() + max2);
        }
        if (this.g) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        hog.H(new gcb(this, 11));
        if (this.h) {
            this.f = new hai(this.a, this.c);
        }
        if (this.g) {
            this.e = new gzy(this.b, this.a);
        }
        t();
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleDiscStyle);
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new CopyOnWriteArrayList();
        final int i2 = 1;
        this.q = new gzq(this) { // from class: gzd
            public final /* synthetic */ AccountParticleDisc a;

            {
                this.a = this;
            }

            @Override // defpackage.gzq
            public final void a() {
                if (i2 != 0) {
                    AccountParticleDisc accountParticleDisc = this.a;
                    accountParticleDisc.n();
                    accountParticleDisc.h();
                    return;
                }
                hog.H(new gcb(this.a, 9));
            }
        };
        final int i3 = 0;
        this.n = new hha(new gzq(this) { // from class: gzd
            public final /* synthetic */ AccountParticleDisc a;

            {
                this.a = this;
            }

            @Override // defpackage.gzq
            public final void a() {
                if (i3 != 0) {
                    AccountParticleDisc accountParticleDisc = this.a;
                    accountParticleDisc.n();
                    accountParticleDisc.h();
                    return;
                }
                hog.H(new gcb(this.a, 9));
            }
        });
        jdl jdlVar = jdl.a;
        this.u = jdlVar;
        this.m = jdlVar;
        LayoutInflater.from(context).inflate(R.layout.account_particle_disc, (ViewGroup) this, true);
        AvatarView avatarView = (AvatarView) findViewById(R.id.og_apd_internal_image_view);
        this.a = avatarView;
        this.b = (BadgeFrameLayout) findViewById(R.id.badge_wrapper);
        this.c = (RingFrameLayout) findViewById(R.id.ring_wrapper);
        this.d = new haf(getResources());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, had.a, i, R.style.OneGoogle_AccountParticleDisc_DayNight);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
            dimensionPixelSize = dimensionPixelSize == Integer.MIN_VALUE ? obtainStyledAttributes.getDimensionPixelSize(4, Integer.MIN_VALUE) : dimensionPixelSize;
            this.o = obtainStyledAttributes.getBoolean(0, true);
            this.h = obtainStyledAttributes.getBoolean(1, false);
            this.r = obtainStyledAttributes.getBoolean(3, false);
            this.s = obtainStyledAttributes.getDimensionPixelSize(2, getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size));
            boolean z = obtainStyledAttributes.getBoolean(6, true);
            Paint paint = avatarView.b;
            Resources resources = avatarView.getResources();
            int i4 = R.color.google_grey100;
            paint.setColor(resources.getColor(z ? R.color.google_grey900 : R.color.google_grey100));
            avatarView.b.setAlpha(30);
            avatarView.c = hog.N(avatarView.c, avatarView.getResources().getColor(true != z ? R.color.google_grey800 : i4));
            avatarView.a.setColor(avatarView.getResources().getColor(true != z ? R.color.og_elevation_dark_5 : R.color.google_white));
            obtainStyledAttributes.recycle();
            k();
            if (dimensionPixelSize != Integer.MIN_VALUE) {
                m(dimensionPixelSize);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
