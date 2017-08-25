package javad.lang;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Field;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.AnnotatedType;
import java.lang.ref.SoftReference;
import java.io.InputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import sun.misc.Unsafe;
import sun.reflect.CallerSensitive;
import sun.reflect.ConstantPool;
import sun.reflect.Reflection;
import sun.reflect.ReflectionFactory;
import sun.reflect.generics.factory.CoreReflectionFactory;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.repository.ClassRepository;
import sun.reflect.generics.repository.MethodRepository;
import sun.reflect.generics.repository.ConstructorRepository;
import sun.reflect.generics.scope.ClassScope;
import sun.security.util.SecurityConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import sun.reflect.annotation.*;
import sun.reflect.misc.ReflectUtil;

public final class XClass<T> implements java.io.Serializable,
GenericDeclaration,
Type,
AnnotatedElement {
	static native Class<?> getPrimitiveClass(String name);

	@Override
	public <T extends Annotation> T getAnnotation(Class<T> annotationClass)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Annotation[] getAnnotations()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Annotation[] getDeclaredAnnotations()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeVariable<?>[] getTypeParameters()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
