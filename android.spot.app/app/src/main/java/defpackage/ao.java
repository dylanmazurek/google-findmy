package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ao implements LayoutInflater.Factory2 {
    public final be a;

    public ao(be beVar) {
        this.a = beVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        fil an;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = am.a;
                try {
                    if (ag.class.isAssignableFrom(am.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        ag e = resourceId != -1 ? this.a.e(resourceId) : null;
                        if (e == null && string != null) {
                            e = this.a.f(string);
                        }
                        if (e == null && id != -1) {
                            e = this.a.e(id);
                        }
                        if (e == null) {
                            am i2 = this.a.i();
                            context.getClassLoader();
                            e = i2.b(attributeValue);
                            e.v = true;
                            e.E = resourceId != 0 ? resourceId : id;
                            e.F = id;
                            e.G = string;
                            e.w = true;
                            e.A = this.a;
                            be beVar = this.a;
                            e.B = beVar.m;
                            Context context2 = beVar.m.c;
                            e.aC(attributeSet, e.h);
                            an = this.a.am(e);
                            if (be.Z(2)) {
                                Objects.toString(e);
                                Integer.toHexString(resourceId);
                            }
                        } else if (!e.w) {
                            e.w = true;
                            e.A = this.a;
                            be beVar2 = this.a;
                            e.B = beVar2.m;
                            Context context3 = beVar2.m.c;
                            e.aC(attributeSet, e.h);
                            an = this.a.an(e);
                            if (be.Z(2)) {
                                Objects.toString(e);
                                Integer.toHexString(resourceId);
                            }
                        } else {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int i3 = cdr.a;
                        e.getClass();
                        cds cdsVar = new cds(e, viewGroup);
                        cdr.d(cdsVar);
                        cdq b = cdr.b(e);
                        if (b.b.contains(cdp.DETECT_FRAGMENT_TAG_USAGE) && cdr.e(b, e.getClass(), cdsVar.getClass())) {
                            cdr.c(b, cdsVar);
                        }
                        e.O = viewGroup;
                        an.f();
                        an.e();
                        View view2 = e.P;
                        if (view2 != null) {
                            if (resourceId != 0) {
                                view2.setId(resourceId);
                            }
                            if (e.P.getTag() == null) {
                                e.P.setTag(string);
                            }
                            e.P.addOnAttachStateChangeListener(new hck(this, an, 1));
                            return e.P;
                        }
                        throw new IllegalStateException(a.ag(attributeValue, "Fragment ", " did not create a view."));
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
