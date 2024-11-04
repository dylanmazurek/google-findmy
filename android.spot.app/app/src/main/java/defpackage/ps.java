package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ps extends ContextWrapper {
    private static Configuration b;
    public int a;
    private Resources.Theme c;
    private LayoutInflater d;
    private Configuration e;
    private Resources f;

    public ps() {
        super(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:            if (r0.equals(defpackage.ps.b) == false) goto L16;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.content.res.Resources b() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f
            if (r0 != 0) goto L3c
            android.content.res.Configuration r0 = r3.e
            if (r0 == 0) goto L36
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L29
            android.content.res.Configuration r0 = r3.e
            if (r0 != 0) goto L13
            goto L36
        L13:
            android.content.res.Configuration r1 = defpackage.ps.b
            if (r1 != 0) goto L21
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            defpackage.ps.b = r1
        L21:
            android.content.res.Configuration r1 = defpackage.ps.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
        L29:
            android.content.res.Configuration r0 = r3.e
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f = r0
            goto L3c
        L36:
            android.content.res.Resources r0 = super.getResources()
            r3.f = r0
        L3c:
            android.content.res.Resources r0 = r3.f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps.b():android.content.res.Resources");
    }

    private final void c() {
        if (this.c == null) {
            this.c = b().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.c.setTo(theme);
            }
        }
        this.c.applyStyle(this.a, true);
    }

    public final void a(Configuration configuration) {
        if (this.f == null) {
            if (this.e == null) {
                this.e = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return b().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.d == null) {
                this.d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.d;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.c;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        c();
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            c();
        }
    }

    public ps(Context context, int i) {
        super(context);
        this.a = i;
    }

    public ps(Context context, Resources.Theme theme) {
        super(context);
        this.c = theme;
    }
}
